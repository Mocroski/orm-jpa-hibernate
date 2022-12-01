package posjavamavenhibernate;

import org.junit.Test;

import dao.DaoGeneric;
import model.UsuarioPessoa;

public class TesteHibernate {

	@Test
	public void testeHibernateUtil() {
		DaoGeneric<UsuarioPessoa> daoGeneric = new DaoGeneric<UsuarioPessoa>();
		
		UsuarioPessoa pessoa = new UsuarioPessoa();
		
		pessoa.setEmail("teste@gmail.com");
		pessoa.setIdade(20);
		pessoa.setLogin("teste");
		pessoa.setNome("teste");
		pessoa.setSobrenome("teste");
		pessoa.setSenha("teste");
		
		daoGeneric.salvar(pessoa);
	}
	
}
