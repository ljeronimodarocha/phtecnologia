package br.com.caelum.vraptor.dao;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Chamado;

@RequestScoped
public class ChamadoDao {

	@Inject
	private EntityManager em;

	public void adiciona(Chamado produto) {
		em.getTransaction().begin();
		em.persist(produto);
		em.getTransaction().commit();
	}

	public void busca(Chamado produto) {
		em.find(Chamado.class, produto.getId());
	}

	@SuppressWarnings("unchecked")
	public List<Chamado> lista() {
		return em.createQuery("select p from Produto p").getResultList();
	}
}