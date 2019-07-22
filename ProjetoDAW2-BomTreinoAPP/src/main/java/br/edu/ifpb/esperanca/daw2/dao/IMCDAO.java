package br.edu.ifpb.esperanca.daw2.dao;

import java.util.List;

import br.edu.ifpb.esperanca.daw2.filtros.UsuarioFiltro;
import br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario;

public class IMCDAO extends DAO<Usuario> {
	
	public IMCDAO() {
		super(Usuario.class);
	}

}
