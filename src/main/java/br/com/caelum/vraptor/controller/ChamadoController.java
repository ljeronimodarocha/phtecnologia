package br.com.caelum.vraptor.controller;

import java.util.Date;
import javax.inject.Inject;
import javax.validation.Valid;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.annotations.Public;
import br.com.caelum.vraptor.dao.ChamadoDao;
import br.com.caelum.vraptor.model.Chamado;
import br.com.caelum.vraptor.simplemail.Mailer;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class ChamadoController {

	@Inject
	private Result result;
	@Inject
	private ChamadoDao dao;
	@Inject
	private Validator validator;
	@Inject
	private UsuarioLogado user;
	@Inject
	private Mailer mailer;

	@Post("/chamado/cadastra")
	@Public
	public void adiciona(@Valid Chamado chamado) {
		Date data_abertura = new Date();
		chamado.setData_abertura(data_abertura);
		chamado.setUsuario(user.getUser());
		if (validator.hasErrors()) {
			validator.add(new I18nMessage("chamado", "chamado.invalido"));
			validator.onErrorRedirectTo(this).abertura();
		}
		dao.adiciona(chamado);
		try {
			enviarEmail(chamado);
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result.include("Conclido", "chamado.concluido");
		result.redirectTo(this).formularioBusca();
	}

	@Get("/formulario")
	public void abertura() {

	}

	@Get
	@Public
	public void enviarEmail(Chamado chamado) throws EmailException {
		Email email = new SimpleEmail();
		email.setSubject("Efetuada a abertura de chamado, número: " + chamado.getId());
		// email.addTo("pedro@phtecnologia.com.br");
		email.addTo(user.getUser().getEmail());
		email.setMsg("Chamado aberto pelo usuário " + chamado.getNome() + ", tipo do chamado: " + chamado.getTipo()
				+ ", problema informado no chamado: " + chamado.getProblema() + ", necessidade do chamado: "
				+ chamado.getNecessidade());
		mailer.send(email);
	}

	@Get("/chamado/formularioBusca")
	public void formularioBusca() {

	}

	@Post("/chamado/busca")
	@Public
	public void busca(Chamado chamado) {
		if (user.getUser() != null) {
			if (chamado.getId() == null) {
				result.include("chamadoLista", dao.lista(user.getUser()));
				result.redirectTo(this).formularioBusca();
				System.out.println("Método lista é chamado aqui");
			} else {
				result.include("chamadoLista", dao.busca(chamado.getId(), user.getUser()));
				result.redirectTo(this).formularioBusca();
				System.out.println("Método busca é chamado aqui");
			}
		} else {
			result.redirectTo(LoginController.class).formulario();
		}
	}

	@Post("/chamado/encerra")
	public void fecha(Chamado chamado) {
		System.out.println(chamado.getId());
		dao.encerra(chamado);
		result.include("chamadoLista", dao.lista(user.getUser()));
		result.redirectTo(this).formularioBusca();
	}
}
