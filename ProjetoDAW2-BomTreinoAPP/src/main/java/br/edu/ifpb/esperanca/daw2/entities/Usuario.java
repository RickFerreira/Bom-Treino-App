package br.edu.ifpb.esperanca.daw2.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Usuario implements Identificavel {

	@Id
	@GeneratedValue(generator = "usuario_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "usuario_seq", sequenceName = "usuario_seq")
	private Long id;
	private String nome;
	private String login;
	private String senha;
	private String sexo;
	private String grupo;
	
	@OneToMany
	(mappedBy = "i" + "")
	private Set<IMC> imc;
	
	@OneToMany
	(mappedBy = "t" + "")
	private Set<Treinos> treinos;
	
	@OneToMany
	(mappedBy = "m" + "")
	private Set<Medidas> medidas;
		
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
		
}
