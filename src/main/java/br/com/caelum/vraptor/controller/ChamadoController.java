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
		chamado.setUsuario(user.getUser());
		chamado.setData_abertura(data_abertura);
		if(validator.hasErrors()){
		validator.add(new I18nMessage("chamado", "chamado.invalido"));
		validator.onErrorRedirectTo(this).abertura();
		}
		dao.adiciona(chamado);
		try {
			enviaPedidoDeNovosItens(chamado);
		} catch (EmailException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result.redirectTo(IndexController.class).inicio();
	}

	@Get("/formulario")
	public void abertura() {

	}

	@Get
	@Public
	public void enviaPedidoDeNovosItens(Chamado chamado) throws EmailException {
		Email email = new SimpleEmail();
		email.setSubject("Efetuada a abertura de chamado, número: " + chamado.getId());
//		email.addTo("pedro@phtecnologia.com.br");
		email.addTo(user.getUser().getEmail());
		email.setMsg("Chamado aberto pelo usuário " + chamado.getNome() +  ", tipo do chamado: " + chamado.getTipo() + 
					", problema informado no chamado: " + chamado.getProblema() + ", necessidade do chamado: " + chamado.getNecessidade());
		mailer.send(email);
	}
	
	@Get("/chamado/formulario_busca")
	public void formulario_busca(){
		
	}

}
