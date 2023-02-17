package hibernate_eb9_prc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Employee employee = new Employee();
		employee.setId(3);
		employee.setName("Rajath");
		employee.setAddress("Chitradurga");
		employee.setPhone(9945229509l);
		employee.setPincode("577501");

		entityTransaction.begin();

		entityManager.persist(employee);

		entityTransaction.commit();

	}

}
