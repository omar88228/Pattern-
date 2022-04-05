package app;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {

	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence
	                .createEntityManagerFactory("JPADemo");
	        EntityManager em = emf.createEntityManager();
	        createStudent(19, "oma", "oues", 100,em);
            createStudent(11, "kkk", "zzzzzz", 98,em);
            createStudent(17, "difla", "Tyagraj", 99,em);
	}
	   private static void createStudent(int id, String firstName, String lastName, int marks,EntityManager em) {

           em.getTransaction().begin();

           Student student = new Student(id, firstName, lastName, marks);

           em.persist(student);

           em.getTransaction().commit();

   }
}
