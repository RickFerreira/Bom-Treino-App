package br.edu.ifpb.esperanca.daw2.beans;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.ifpb.esperanca.daw2.entities.IMC;
import br.edu.ifpb.esperanca.daw2.services.IMCService;

@ViewScoped
@Named
public class IMCBean implements Serializable {

	@Inject
	private IMCService service;

	protected IMC entidade;

	protected Collection<IMC> entidades;

	public IMCBean() {
	}
	
	@PostConstruct
	public void init() {
		entidade = newEntidade();
		entidades = getService().getAll();
	}

	public void remove(IMC entidade) {
		getService().remove(entidade);
		limpar();
	}

	public IMC getEntidade() {
		return entidade;
	}

	public void setEntidade(IMC entidade) {
		this.entidade = entidade;
	}

	public Collection<IMC> getEntidades() {
		return entidades;
	}

	public void setEntidades(Collection<IMC> entidades) {
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

	protected IMC newEntidade() {
		return new IMC();
	}

	public IMCService getService() {
		return service;
	}

}
