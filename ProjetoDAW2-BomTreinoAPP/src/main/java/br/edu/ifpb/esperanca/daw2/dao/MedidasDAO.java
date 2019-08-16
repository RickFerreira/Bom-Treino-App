package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.filtros.UsuarioFiltro;

public class MedidasDAO extends DAO<Usuario> {
	
	public MedidasDAO() {
		super(Usuario.class);
	}
}
