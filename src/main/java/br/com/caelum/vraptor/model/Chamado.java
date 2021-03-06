package br.com.caelum.vraptor.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Chamado {

	@GeneratedValue
	@Id
	private Long id;

	@NotEmpty
	@Size(min = 0, message = "{chamado.nome}")
	private String nome;

	@NotEmpty
	@Size(min = 0, message = "{chamado.setor}")
	private String setor;
	//
	@NotEmpty
	@Size(min = 0, message = "{chamado.tipo}")
	private String tipo;

	@NotEmpty
	@Size(min = 0, message = "{chamado.problema}")
	private String problema;

	@NotEmpty
	@Size(min = 0, message = "{chamado.necessidade}")
	private String necessidade;

	@ManyToOne
	@JoinColumn(referencedColumnName = "id", name = "id_Usuario")
	private Usuario usuario;
	
	private Date data_abertura;
	
	private Date data_fechamento;
	
	private String estado;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getNecessidade() {
		return necessidade;
	}

	public void setNecessidade(String necessidade) {
		this.necessidade = necessidade;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getData_abertura() {
		return data_abertura;
	}

	public void setData_abertura(Date data_abertura) {
		this.data_abertura = data_abertura;
	}

	public Date getData_fechamento() {
		return data_fechamento;
	}

	public void setData_fechamento(Date data_fechamento) {
		this.data_fechamento = data_fechamento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}