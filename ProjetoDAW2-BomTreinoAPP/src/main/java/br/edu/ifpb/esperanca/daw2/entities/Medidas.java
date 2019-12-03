package br.edu.ifpb.esperanca.daw2.entities;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Medidas implements Identificavel {

	@Id
	@GeneratedValue(generator = "medidas_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "medidas_seq", sequenceName = "medidas_seq")
	private Long id;
	private Date data;
	private Double medida;
	private Double peso;
	private String região;
	
	@ManyToOne
	@JoinColumn (name = "id_m")
	Medidas m;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Double getMedida() {
		return medida;
	}
	public void setMedida(Double medida) {
		this.medida = medida;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public String getRegião() {
		return região;
	}
	public void setRegião(String região) {
		this.região = região;
	}
		
}
