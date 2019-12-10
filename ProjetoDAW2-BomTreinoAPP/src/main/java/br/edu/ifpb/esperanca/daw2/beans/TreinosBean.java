package br.edu.ifpb.esperanca.daw2.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.entities.Treinos;
import br.edu.ifpb.esperanca.daw2.services.TreinosService;

@ViewScoped
@Named
public class TreinosBean implements Serializable {

	@Inject
	private TreinosService service;

	protected Treinos entidade;

	protected Collection<Treinos> entidades;

	public TreinosBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Treinos entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Treinos getEntidade() {
		return entidade;
	}

	public void setEntidade(Treinos entidade) {
		this.entidade = entidade;
	}

	public Collection<Treinos> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Treinos> entidades) {
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

	protected Treinos newEntidade() {
		return new Treinos();
	}

	public TreinosService getService() {
		return service;
	}

}
