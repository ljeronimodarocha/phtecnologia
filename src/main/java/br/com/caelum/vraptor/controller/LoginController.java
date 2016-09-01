package br.com.caelum.vraptor.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.annotations.Public;
import br.com.caelum.vraptor.dao.UsuarioDao;
import br.com.caelum.vraptor.model.Usuario;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class LoginController {

	@Inject
	private UsuarioDao dao;
	@Inject
	private Result result;
	@Inject
	private Validator validator;

	@Get("/login/formulario")
	@Public
	public void formulario() {
	}

	@Post("/login/autentica")
	@Public
	public void autentica(@Valid Usuario usuario) {
		if(validator.hasErrors()){
			validator.onErrorRedirectTo(this).formulario();
		}else if (!dao.existe(usuario)) {
			validator.add(new I18nMessage("login", "login.invalido"));
			validator.onErrorRedirectTo(this).formulario();
		}
		result.redirectTo(ChamadoController.class).abertura();
	}
}