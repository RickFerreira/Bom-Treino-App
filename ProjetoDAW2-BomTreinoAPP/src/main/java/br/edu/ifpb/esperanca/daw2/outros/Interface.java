package br.edu.ifpb.esperanca.daw2.outros;

import java.util.Date;

import br.edu.ifpb.esperanca.daw2.entities.Exercicios;
import br.edu.ifpb.esperanca.daw2.entities.IMC;
import br.edu.ifpb.esperanca.daw2.entities.Medidas;
import br.edu.ifpb.esperanca.daw2.entities.Treinos;
import br.edu.ifpb.esperanca.daw2.entities.Usuario;
import br.edu.ifpb.esperanca.daw2.exceptions.LoginInvalidoException;
import br.edu.ifpb.esperanca.daw2.exceptions.NomeInvalidoException;
import br.edu.ifpb.esperanca.daw2.exceptions.RegiaoInvalidoException;

public interface Interface {
	
	public Usuario addUsuario(String nome, String login, String senha, String sexo) throws NomeInvalidoException, LoginInvalidoException;

	public Usuario removeUsuario(String login, String senha) throws LoginInvalidoException;

	public Treinos addTreinos(String nome, String descricao) throws NomeInvalidoException;

	public Treinos removeTreinos(String nome) throws NomeInvalidoException;

	public Medidas addMedidas (Date data, Double medida, Double peso, String regiao) throws RegiaoInvalidoException;
	
	public Medidas atualizaMedidas (Date data, Double medida, Double peso, String regiao) throws RegiaoInvalidoException;
	
	public Medidas RemoveMedidas (Date data, Double medida, Double peso, String regiao) throws RegiaoInvalidoException;
	
	public IMC verificaIMC (Double altura, Double peso);
	
	public Exercicios addExercicios (String nome, String descricao, Date dias, String regiao, Double carga, int serie, int repeticao) throws NomeInvalidoException, RegiaoInvalidoException;

	public Exercicios removeExercicios (String nome, String descricao, Date dias, String regiao, Double carga, int serie, int repeticao) throws NomeInvalidoException, RegiaoInvalidoException;
	
}
