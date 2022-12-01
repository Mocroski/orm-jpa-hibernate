package dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import posjavamavenhibernate.HibernateUtil;

/*dao é um padrao usado para colocar todos os metodos de persistencia como salvar, excluir, consultar, atualizar etc*/
public class DaoGeneric <E>{
	
	private EntityManager entityManager = HibernateUtil.getEntityManager();
	
	public void salvar(E entidade) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(entidade); //salvar
		transaction.commit();
		
	}
	

}
