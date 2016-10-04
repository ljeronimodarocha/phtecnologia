package br.com.caelum.vraptor.dao;

import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import br.com.caelum.vraptor.model.Chamado;
import br.com.caelum.vraptor.model.Usuario;

@RequestScoped
public class ChamadoDao {

	@Inject
	private EntityManager em;

	public void adiciona(Chamado chamado) {
		chamado.setEstado("Aberto");
		em.getTransaction().begin();
		em.persist(chamado);
		em.getTransaction().commit();
	}

	public List busca(Long id, Usuario usuario) {
		return  em.createQuery("select c from Chamado c where c.id="+ id + "and c.usuario.id=" + usuario.getId()).getResultList();
	}

	public List lista(Usuario usuario){
		return em.createQuery("select c from Chamado c where c.usuario.id=" + usuario.getId()).getResultList();
	}
	public void encerra(Chamado chamado){
		chamado = em.find(Chamado.class, chamado.getId());
		Date data_encerramento = new Date();
		chamado.setData_fechamento(data_encerramento);
		chamado.setEstado("Fechado");
		em.getTransaction().begin();
		em.persist(chamado);
		em.getTransaction().commit();
	}
}