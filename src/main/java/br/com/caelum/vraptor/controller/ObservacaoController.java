package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.ObservacaoDao;
import br.com.caelum.vraptor.model.Observacao;

@Controller
public class ObservacaoController {
	@Inject
	private UsuarioLogado user;
	@Inject
	private ObservacaoDao dao;
	@Inject
	private Result result;
	
	
	
	
	
	
	@Post("/observacao/formularioObs")
	public void formulario(Observacao observacao){
		observacao.setUsuario(user.getUser());
		System.out.println(observacao.getChamado().getId());
		observacao.setObservacao("teste teste");
		result.include("obs", observacao.getChamado().getId());
		
	}
	@Post("/observacao/adiciona")
	public void adiciona(Observacao observacao){
		observacao.setUsuario(user.getUser());
		System.out.println("Numero do Chamado: " + observacao.getChamado().getId());
		System.out.println("Nome do usuário" + observacao.getUsuario().getNome());
		System.out.println(observacao.getObservacao());
		result.redirectTo(ChamadoController.class).formularioBusca();
//		dao.adiciona(observacao);
	}

}
