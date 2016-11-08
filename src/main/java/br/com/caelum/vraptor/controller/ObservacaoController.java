package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.annotations.Public;
import br.com.caelum.vraptor.dao.ObservacaoDao;
import br.com.caelum.vraptor.model.Observacao;
import br.com.caelum.vraptor.simplemail.Mailer;

@Controller
public class ObservacaoController {
	@Inject
	private UsuarioLogado user;
	@Inject
	private ObservacaoDao dao;
	@Inject
	private Result result;
	@Inject
	private Mailer mailer;
	
	
	
	
	
	
	@Post("/observacao/formularioObs")
	public void formulario(Observacao observacao){
		observacao.setUsuario(user.getUser());
		result.include("obs", observacao);
		
	}
	@Public
	@Post("/observacao/adiciona")
	public void adiciona(Observacao observacao){
		observacao.setUsuario(user.getUser());
		System.out.println(observacao.getChamado().getId());
		System.out.println(observacao.getObservacao());
		System.out.println(observacao.getUsuario());
		observacao.setUsuario(user.getUser());
		dao.adiciona(observacao);
		try {
			enviarEmail(observacao);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		result.redirectTo(ChamadoController.class).formularioBusca();

	}
	
	public void enviarEmail(Observacao observacao) throws EmailException{
		Email email = new SimpleEmail();
		email.setSubject("Adicionado uma observação ao chamado: " + observacao.getChamado().getId());
		// email.addTo("pedro@phtecnologia.com.br");
		email.addTo(user.getUser().getEmail());
		email.setMsg("Observação adicionada ao chamado: " + observacao.getObservacao());
		mailer.send(email);
		
	}

}
