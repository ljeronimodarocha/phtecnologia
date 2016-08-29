package br.com.caelum.vraptor.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.ChamadoDao;
import br.com.caelum.vraptor.model.Chamado;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.caelum.vraptor.view.Results;

@Controller
public class ChamadoController {

	private final Result result;
	private final ChamadoDao dao;
	private final Validator validator;
	private final UsuarioLogado user;

	@Inject
	public ChamadoController(Result result, ChamadoDao dao, Validator validator, UsuarioLogado user) {
		this.result = result;
		this.dao = dao;
		this.validator = validator;
		this.user = user;
	}

	@Deprecated
	public ChamadoController() {
		this(null, null, null, null);
	}


	@Path("/chamado/cadastra")@Post
	public void adiciona(Chamado chamado) {
//		validator.onErrorUsePageOf(this).formulario();
		System.out.println(user.getUser().getId());
		chamado.setUsuario(user.getUser());
//		dao.adiciona(chamado);
		result.redirectTo(IndexController.class).inicio();
	}
	@Get("/formulario")
	public void abertura(){
		
	}

	
}
