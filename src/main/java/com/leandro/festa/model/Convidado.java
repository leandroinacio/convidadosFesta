package com.leandro.festa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado implements Serializable{

	public static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private Integer qtdAcompanhantes;

	public Convidado() {
		super();
	}

	public Convidado(Long id, String nome, Integer qtdAcompanhantes) {
		super();
		this.id = id;
		this.nome = nome;
		this.qtdAcompanhantes = qtdAcompanhantes;
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
	public Integer getQtdAcompanhantes() {
		return qtdAcompanhantes;
	}
	public void setQtdAcompanhantes(Integer qtdAcompanhantes) {
		this.qtdAcompanhantes = qtdAcompanhantes;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
