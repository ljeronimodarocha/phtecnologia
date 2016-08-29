package br.com.caelum.vraptor.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.vraptor.controller.UsuarioLogado;
import br.com.caelum.vraptor.model.Usuario;

public class UsuarioDao {

	private final EntityManager em;
	private final UsuarioLogado usuariologado;
	private boolean logado;
	
	@Inject
	public UsuarioDao(EntityManager em, UsuarioLogado usuarioLogado) {
		this.em = em;
		this.usuariologado = usuarioLogado;
	}
	
	@Deprecated
	public UsuarioDao() {
		this(null, null); // para uso do CDI
	}
	
//	public boolean existe(Usuario usuario) {
//		return !em.createQuery("select u from Usuario u where u.nome = "
//			+ ":nome and u.senha = :senha", Usuario.class)
//			.setParameter("nome", usuario.getNome())
//			.setParameter("senha", usuario.getSenha())
//			.getResultList().isEmpty();
//	}
	
	public boolean existe(Usuario usuario){
		 try {
	            Query query = em.createQuery("select u from Usuario as u where u.nome = :nome and u.senha = :senha");
	            query.setParameter("nome", usuario.getNome());
	            query.setParameter("senha", usuario.getSenha());
	            List<Usuario> usuarios = query.getResultList();
	            for (Usuario user : usuarios) {
	            	usuariologado.setUser(user);
	                logado = true;
	            } 
	        } catch (Exception e) {
	            logado = false;
	            e.printStackTrace();
	        }
	return logado;
	}

	public void salva(Usuario usuario) {
		em.persist(usuario);
	}

}
