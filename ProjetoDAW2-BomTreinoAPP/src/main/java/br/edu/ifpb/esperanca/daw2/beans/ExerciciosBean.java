package br.edu.ifpb.esperanca.daw2.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.entities.Exercicios;
import br.edu.ifpb.esperanca.daw2.services.ExerciciosService;

@ViewScoped
@Named
public class ExerciciosBean implements Serializable {

	@Inject
	private ExerciciosService service;

	protected Exercicios entidade;

	protected Collection<Exercicios> entidades;

	public ExerciciosBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Exercicios entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Exercicios getEntidade() {
		return entidade;
	}

	public void setEntidade(Exercicios entidade) {
		this.entidade = entidade;
	}

	public Collection<Exercicios> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Exercicios> entidades) {
		this.entidades = entidades;
	}

	public void save() {
		getService().save(entidade);
		limpar();
	}

	public void editar(Long id) {
		this.getEntidade().setId(id);
		save();
	}

	public void limpar() {
		entidades = getService().getAll();
		entidade = newEntidade();
	}

	protected Exercicios newEntidade() {
		return new Exercicios();
	}

	public ExerciciosService getService() {
		return service;
	}

}
