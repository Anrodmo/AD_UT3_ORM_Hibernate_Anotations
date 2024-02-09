package AD_UT4.Hibernate_Anotations;


import org.springframework.stereotype.Repository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ClienteDAO {
	
	private EntityManagerFactory entityManagerFactory;
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public ClienteDAO() {
		entityManagerFactory = Persistence.createEntityManagerFactory("persistence.xml");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	@Transactional
	public void save(Cliente cliente) {
		entityManager.persist(cliente);
	}
	
	@Transactional
	public void delete(long ClienteId) {
		Cliente cliente = entityManager.find(Cliente.class, ClienteId);
		if(cliente != null) {
			entityManager.remove(cliente);
		}
		
	}

}
