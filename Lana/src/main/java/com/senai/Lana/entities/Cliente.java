package com.senai.Lana.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	//atributos da classe
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "NCliente")
	private String nCliente;
	
	@Column(name = "Telefone")
	private String fone;
	
	//métodos da classe	

	public Long getIdcCliente() {
		return idcCliente;
	}

	public void setIdcCliente(Long idcCliente) {
		this.idcCliente = idcCliente;
	}

	public String getnCliente() {
		return nCliente;
	}

	public void setnCliente(String nCliente) {
		this.nCliente = nCliente;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	

	
}
