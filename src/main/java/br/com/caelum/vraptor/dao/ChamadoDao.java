package br.com.caelum.vraptor.dao;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.vraptor.controller.UsuarioLogado;
import br.com.caelum.vraptor.model.Chamado;
import br.com.caelum.vraptor.model.Usuario;

@RequestScoped
public class ChamadoDao {

	@Inject
	private EntityManager em;

	public void adiciona(Chamado produto) {
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
	}

	public List busca(Long id, Usuario usuario) {
		return  em.createQuery("select c from Chamado c where c.id="+ id + "and c.usuario.id=" + usuario.getId()).getResultList();
	}

	public List lista(Usuario usuario){
		return em.createQuery("select c from chamado where c.usuario.id=" + usuario.getId()).getResultList();
	}
	
}