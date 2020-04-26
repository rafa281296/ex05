package br.usjt.ex05;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cidade implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private Double longi;
	private Double lati;
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
	public Double getLongi() {
		return longi;
	}
	public void setLongi(Double longi) {
		this.longi = longi;
	}
	public Double getLati() {
		return lati;
	}
	public void setLati(Double lati) {
		this.lati = lati;
	}
	

}
