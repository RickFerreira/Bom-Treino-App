package br.edu.ifpb.esperanca.daw2.outros;

import java.util.Date;

import br.edu.ifpb.esperanca.daw2.dao.DAO;
import br.edu.ifpb.esperanca.daw2.dao.ExerciciosDAO;
import br.edu.ifpb.esperanca.daw2.dao.IMCDAO;
import br.edu.ifpb.esperanca.daw2.dao.MedidasDAO;
import br.edu.ifpb.esperanca.daw2.dao.TreinosDAO;
import br.edu.ifpb.esperanca.daw2.dao.UsuarioDAO;
import br.edu.ifpb.esperanca.daw2.entities.Exercicios;
import br.edu.ifpb.esperanca.daw2.entities.IMC;
import br.edu.ifpb.esperanca.daw2.entities.Medidas;
import br.edu.ifpb.esperanca.daw2.entities.Treinos;
import br.edu.ifpb.esperanca.daw2.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.exceptions.LoginInvalidoException;
import br.edu.ifpb.esperanca.daw2.exceptions.NomeInvalidoException;
import br.edu.ifpb.esperanca.daw2.exceptions.RegiaoInvalidoException;

public class Implementar implements Interface{

	@Override
	public Usuario addUsuario(String nome, String login, String senha, String sexo)
			throws NomeInvalidoException, LoginInvalidoException {
		if (nome == null || nome.equals("")) {
			throw new NomeInvalidoException();
		}
		DAO<Usuario> dao = new UsuarioDAO();
		Usuario u = new Usuario();
		u.setNome(nome);
		u.setLogin(login);
		u.setSenha(senha);
		u.setSexo(sexo);
		dao.save(u);

		return u;
	}

	@Override
	public Usuario removeUsuario(String login, String senha) throws LoginInvalidoException {
		if (login == null || login.equals("")) {
			throw new LoginInvalidoException();
		}
		DAO<Usuario> dao = new UsuarioDAO();
		Usuario u = new Usuario();
		u.setLogin(login);
		u.setSenha(senha);
		dao.remove(u);

		return u;

	}

	@Override
	public Treinos addTreinos(String nome, String descricao) throws NomeInvalidoException {
		if (nome == null || nome.equals("")) {
			throw new NomeInvalidoException();
		}
		DAO<Treinos> dao = new TreinosDAO();
		Treinos t = new Treinos();
		t.setNome(nome);
		t.setDescricao(descricao);
		dao.save(t);

		return t;
	}

	@Override
	public Treinos removeTreinos(String nome) throws NomeInvalidoException {
		if (nome == null || nome.equals("")) {
			throw new NomeInvalidoException();
		}
		DAO<Treinos> dao = new TreinosDAO();
		Treinos t = new Treinos();
		t.setNome(nome);
		t.remove(t);

		return t;
	}

	@Override
	public Medidas addMedidas(Date data, Double medida, Double peso, String regiao) throws RegiaoInvalidoException {
		DAO<Medidas> dao = new MedidasDAO();
		Medidas m = new Medidas();
		m.setData(data);
		m.setMedida(medida);
		m.setPeso(peso);
		m.setRegiao(regiao);
		dao.save(m);

		return m;
	}
	
	@Override
	public Medidas atualizaMedidas (Date data, Double medida, Double peso, String regiao) throws RegiaoInvalidoException{
		DAO<Medidas> dao = new MedidasDAO();
		Medidas m = new Medidas();
		m.setData(data);
		m.setMedida(medida);
		m.setPeso(peso);
		m.setRegiao(regiao);
		m.update(m);

		return m;
	}
	
	@Override
	public Medidas RemoveMedidas (Date data, Double medida, Double peso, String regiao) throws RegiaoInvalidoException{
		DAO<Medidas> dao = new MedidasDAO();
		Medidas m = new Medidas();
		m.setData(data);
		m.setMedida(medida);
		m.setPeso(peso);
		m.setRegiao(regiao);
		m.remove(m);

		return m;
	}
	
	@Override
	public IMC verificaIMC (Double altura, Double peso) {
		DAO<IMC> dao = new IMCDAO();
		IMC i = new IMC();
		i.setAltura(altura);
		i.setPeso(peso);
		i.save(i);
		
		return i;
	}
	
	@Override
	public Exercicios addExercicios (String nome, String descricao, Date dias, String regiao, Double carga, int serie, int repeticao) throws NomeInvalidoException, RegiaoInvalidoException{
		if (nome == null || nome.equals("")) {
			throw new NomeInvalidoException();
		}
		DAO<Exercicios> dao = new ExerciciosDAO();
		Exercicios e = new Exercicios();
		e.setNome(nome);
		e.setDescricao(descricao);
		e.setDias(dias);
		e.setRegiao(regiao);
		e.setCarga(carga);
		e.setSerie(serie);
		e.setRepeticao(repeticao);
		dao.save(e);

		return e;
	}
		
	@Override
	public Exercicios removeExercicios (String nome, String descricao, Date dias, String regiao, Double carga, int serie, int repeticao) throws NomeInvalidoException, RegiaoInvalidoException{
		if (nome == null || nome.equals("")) {
			throw new NomeInvalidoException();
		}
		DAO<Exercicios> dao = new ExerciciosDAO();
		Exercicios e = new Exercicios();
		e.setNome(nome);
		e.setDescricao(descricao);
		e.setDias(dias);
		e.setRegiao(regiao);
		e.setCarga(carga);
		e.setSerie(serie);
		e.setRepeticao(repeticao);
		dao.remove(e);

		return e;
	}
	
}
