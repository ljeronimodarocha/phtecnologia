package br.com.caelum.vraptor.controller;

import java.io.Serializable;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.dao.UsuarioDao;
import br.com.caelum.vraptor.model.Usuario;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Validator;


@Controller
public class LoginController{

    private final UsuarioDao dao;
    private final Result result;
    private final Validator validator;
    private final UsuarioLogado usuarioLogado;

    @Inject
    public LoginController(UsuarioDao dao, Result result, Validator validator, UsuarioLogado usuarioLogado) {
        this.dao = dao;
        this.result = result;
        this.validator = validator;
        this.usuarioLogado = usuarioLogado;
    }

    @Deprecated
    LoginController() {
        this(null, null, null, null); // para uso do CDI
    }
//
    @Get("/login/formulario")
    public void formulario() {
    }

   @Post("/login/autentica")
    public void autentica(Usuario usuario) {
        if(!dao.existe(usuario)){
            validator.add(new I18nMessage("login", "login.invalido"));
            validator.onErrorUsePageOf(this).formulario();
        	result.redirectTo(ChamadoController.class).abertura();
        }
        usuarioLogado.setUser(usuario);
        result.redirectTo(ChamadoController.class).abertura();
    }    
}