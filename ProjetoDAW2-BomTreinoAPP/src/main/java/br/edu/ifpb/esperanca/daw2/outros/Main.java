public class Main {

	public static void main(String[] args) {
		
		Usuario u = new Usuario();
		u.setNome("Winchester");
		DAO<Usuario> dao = new DAO<Usuario>();
		dao.save(u);
	}

}