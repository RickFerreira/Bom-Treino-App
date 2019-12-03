package br.edu.ifpb.esperanca.daw2.entities;

import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Treinos implements Identificavel {

	public Set<Exercicios> getExercicios() {
		return exercicios;
	}
	public void setExercicios(Set<Exercicios> exercicios) {
		this.exercicios = exercicios;
	}
	@Id
	@GeneratedValue(generator = "treinos_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "treinos_seq", sequenceName = "treinos_seq")
	private Long id;
	private String nome;
	private String descricao;
	
	
	@ManyToOne
	@JoinColumn (name = "id_t")
	Treinos t;
	
	@ManyToMany
	@JoinTable(
			name="treino_exercicio", 
			joinColumns=@JoinColumn(name="id_treino"), 
			inverseJoinColumns=@JoinColumn(name="id_exercicio"))
	private Set<Exercicios> exercicios;
	
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
		
}
