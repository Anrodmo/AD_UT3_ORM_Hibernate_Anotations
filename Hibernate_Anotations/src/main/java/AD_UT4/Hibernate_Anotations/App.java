package AD_UT4.Hibernate_Anotations;

import java.sql.ResultSet;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        Cliente cliente = new Cliente();
//        
//        ClienteDAO clienteDao = new ClienteDAO();
//        
//        clienteDao.save(cliente);
        
     // Crea el EntityManagerFactory usando el nombre de la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");

        // Crea el EntityManager
        EntityManager em = emf.createEntityManager();

        // Crea un nuevo libro
        Cliente nuevoLibro = new Cliente("andres");

        // Guarda el libro en la base de datos
        em.getTransaction().begin();
        em.persist(nuevoLibro);
        em.getTransaction().commit();              
        em.close();
        emf.close();
        

       
        
    }
}
