package br.com.caelum.vraptor.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.caelum.vraptor.model.Usuario;


@SessionScoped
@Named
public class UsuarioLogado implements Serializable {

	private Usuario user;

	public Usuario getUsuario() {
		return user;
	}

	public void setUsuario(Usuario usuario) {
		this.user = usuario;
	}
}
