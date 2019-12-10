package br.edu.ifpb.esperanca.daw2.outros;


import br.edu.ifpb.esperanca.daw2.dao.DAO;
import br.edu.ifpb.esperanca.daw2.dao.UsuarioDAO;
import br.edu.ifpb.esperanca.daw2.entities.Usuario;

public class Main {

	public static void main(String[] args) {
		
		Usuario u = new Usuario();
		u.setNome("Winchester");
		DAO<Usuario> dao = new UsuarioDAO();
		dao.save(u);
	}

}