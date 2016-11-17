package br.com.caelum.vraptor.dao;

import java.util.List;

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
	
	public List buscaObs(Observacao observacao){
		return  em.createQuery("select o from Observacao o where o.usuario.id="+ observacao.getUsuario().getId() + "and o.chamado.id=" + observacao.getChamado().getId()).getResultList();
	}
}
