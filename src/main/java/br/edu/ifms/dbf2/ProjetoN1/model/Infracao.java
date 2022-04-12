package br.edu.ifms.dbf2.ProjetoN1.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Infracao implements Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	private Integer ponto;
	private Double valor;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getPonto() {
		return ponto;
	}
	public void setPonto(Integer ponto) {
		this.ponto = ponto;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	

}
