package br.edu.ifpb.esperanca.daw2.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.entities.Medidas;
import br.edu.ifpb.esperanca.daw2.services.MedidasService;

@ViewScoped
@Named
public class MedidasBean implements Serializable {

	@Inject
	private MedidasService service;

	protected Medidas entidade;

	protected Collection<Medidas> entidades;

	public MedidasBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(Medidas entidade) {
		getService().remove(entidade);
		limpar();
	}

	public Medidas getEntidade() {
		return entidade;
	}

	public void setEntidade(Medidas entidade) {
		this.entidade = entidade;
	}

	public Collection<Medidas> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<Medidas> entidades) {
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

	protected Medidas newEntidade() {
		return new Medidas();
	}

	public MedidasService getService() {
		return service;
	}

}
