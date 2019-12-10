package br.edu.ifpb.esperanca.daw2.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Exercicios implements Identificavel {

	@Id
	private Long id;
	private String nome;
	private String descricao;
	private Date dias;
	private String regiao;
	private Double carga;
	private int serie;
	private int repeticao;
	
	@ManyToMany(mappedBy="exercicios")
	private Set<Treinos> treinos;
	
	
	public Set<Treinos> getTreinos() {
		return treinos;
	}
	public void setTreinos(Set<Treinos> treinos) {
		this.treinos = treinos;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDias() {
		return dias;
	}
	public void saetDias(Date dias) {
		this.dias = dias;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public Double getCarga() {
		return carga;
	}
	public void setCarga(Double carga) {
		this.carga = carga;
	}
	public int getSerie() {
		return serie;
	}
	public void setSerie(int serie) {
		this.serie = serie;
	}
	public int getRepeticao() {
		return repeticao;
	}
	public void setRepeticao(int repeticao) {
		this.repeticao = repeticao;
	}
	public void setDias(Date dias2) {
		// TODO Auto-generated method stub
		
	}
		
}
