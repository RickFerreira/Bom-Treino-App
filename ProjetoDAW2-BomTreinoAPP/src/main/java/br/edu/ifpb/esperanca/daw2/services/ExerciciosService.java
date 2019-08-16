package br.edu.ifpb.esperanca.daw2.services;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.edu.ifpb.esperanca.daw2.dao.ExerciciosDAO;
import br.edu.ifpb.esperanca.daw2.entities.Exercicios;
import br.edu.ifpb.esperanca.daw2.util.TransacionalCdi;

@ApplicationScoped
public class ExerciciosService implements Serializable, Service<Exercicios> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7803325791425670859L;
	
	@Inject
	private ExerciciosDAO userDAO;
	
	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#save(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void save(Exercicios exercicios) {
		ExerciciosDAO.save(exercicios);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#update(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario, boolean)
	 */
	@Override
	@TransacionalCdi
	public void update(Exercicios exercicios)  {
		ExerciciosDAO.update(exercicios);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#delete(br.edu.ifpb.esperanca.daw2.ifoto.entities.Usuario)
	 */
	@Override
	@TransacionalCdi
	public void remove(Exercicios exercicios) {
		ExerciciosDAO.remove(exercicios);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getByID(long)
	 */
	@Override
	public Exercicios getByID(long exerciciosId)  {
			return exerciciosDAO.getByID(exerciciosId);
	}

	/* (non-Javadoc)
	 * @see br.edu.ifpb.esperanca.daw2.services.Service#getAll()
	 */
	@Override
	public List<Exercicios> getAll() {
			return exerciciosDAO.getAll();
	}
		
}
