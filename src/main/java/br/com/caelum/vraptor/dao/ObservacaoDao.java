package br.com.caelum.vraptor.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.caelum.vraptor.model.Observacao;

@RequestScoped
public class ObservacaoDao {
	@Inject
	private EntityManager em;

	public void adiciona(Observacao observacao){
		em.getTransaction().begin();
		em.persist(observacao);
		em.getTransaction().commit();
		
	}
}
