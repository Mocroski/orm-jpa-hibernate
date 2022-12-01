package posjavamavenhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*Quando o projeto subir essa classe vai ser chamado e vai ler o persistence.xml e vai instanciar a conexão com o banco de dados, tem de usar static porque ela so pode ler  o arquivo uma vez para nao dar erro
*/
public class HibernateUtil {

	public static EntityManagerFactory factory = null;
	
	static {
		init();
	}
	
	
	private static void init() {
		
		try {
			
			if(factory == null) {
				factory = Persistence.createEntityManagerFactory("pos-java-maven-hibernate");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager(); //Prove a parte dde persistencia
	}
	
	public static Object getPrimaryKey(Object entity) { //Retorna a primary key
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
	}
	
}
