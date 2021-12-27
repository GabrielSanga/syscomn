package com.projeto.syscomn.domain;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
@DiscriminatorColumn(name="Tipo")
public abstract class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer idPessoa;
	
	protected String nomePessoa;
	
	@Column(unique = true)
	protected String cpfCnpjPessoa;
	
	protected String telefonePessoa;
	
	protected String emailPessoa;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	protected LocalDate dtaNascimentoPessoa;
	
	protected String enderecoPessoa;
	
	protected String statusPessoa;
	
	protected String rgPessoa;
	
	protected String observacaoPessoa;
	
	protected String login;	
	
	protected String senha;
	
	protected Integer tipoPessoa;
	
	@ManyToOne
	@JoinColumn(name = "idAssinante")
	protected Assinante assinante;

	public Pessoa() {
		super();
	}
	
	public Pessoa(Integer idPessoa, String nomePessoa, String cpfCnpjPessoa, String telefonePessoa, String emailPessoa,
			LocalDate dtaNascimentoPessoa, String enderecoPessoa, String statusPessoa, String rgPessoa,
			String observacaoPessoa, String login, String senha, Integer tipoPessoa, Assinante assinante) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.cpfCnpjPessoa = cpfCnpjPessoa;
		this.telefonePessoa = telefonePessoa;
		this.emailPessoa = emailPessoa;
		this.dtaNascimentoPessoa = dtaNascimentoPessoa;
		this.enderecoPessoa = enderecoPessoa;
		this.statusPessoa = statusPessoa;
		this.rgPessoa = rgPessoa;
		this.observacaoPessoa = observacaoPessoa;
		this.login = login;
		this.senha = senha;
		this.tipoPessoa = tipoPessoa;
		this.assinante = assinante;
	}
	
}
