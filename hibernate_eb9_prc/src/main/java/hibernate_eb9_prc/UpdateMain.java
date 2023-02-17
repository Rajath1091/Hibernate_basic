package hibernate_eb9_prc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateMain {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
//		Employee employee=new Employee();
//		employee.setId(3);
//		employee.setName("Apoorva");
//		employee.setAddress("Sirsi");
//		employee.setPincode("954621");
//		employee.setPhone(9564665612l);
		
		//Update only specific data
		Employee employee=entityManager.find(Employee.class, 3);
		employee.setPhone(143143143);
		
		entityTransaction.begin();
		
		entityManager.merge(employee);
		
		entityTransaction.commit();
	}

}
