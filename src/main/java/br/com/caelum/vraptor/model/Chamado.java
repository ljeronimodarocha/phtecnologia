package br.com.caelum.vraptor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Chamado {

	@GeneratedValue
	@Id
	private Long id;

//	@NotEmpty
//	@Size(min = 3)
	private String nome;
//
//	@NotEmpty
//	@Size(min = 3)
	private String setor;
//
//	@NotEmpty
//	@Size(min = 3)
	private String tipo;
//
//	@NotEmpty
//	@Size(min = 3)
	private String problema;

//	@NotEmpty
//	@Size(min = 3)
	private String necessidade;

	public Chamado() {
	}

	public Chamado(Long id, String nome, String setor, String tipo, String problema, String necessidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.setor = setor;
		this.tipo = tipo;
		this.problema = problema;
		this.necessidade = necessidade;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the setor
	 */
	public String getSetor() {
		return setor;
	}

	/**
	 * @param setor
	 *            the setor to set
	 */
	public void setSetor(String setor) {
		this.setor = setor;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo
	 *            the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the problema
	 */
	public String getProblema() {
		return problema;
	}

	/**
	 * @param problema
	 *            the problema to set
	 */
	public void setProblema(String problema) {
		this.problema = problema;
	}

	/**
	 * @return the necessidade
	 */
	public String getNecessidade() {
		return necessidade;
	}

	/**
	 * @param necessidade
	 *            the necessidade to set
	 */
	public void setNecessidade(String necessidade) {
		this.necessidade = necessidade;
	}

}