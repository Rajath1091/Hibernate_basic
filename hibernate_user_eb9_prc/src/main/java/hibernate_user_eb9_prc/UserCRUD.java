package hibernate_user_eb9_prc;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserCRUD {

	public void signupUser(User user) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(user);

		entityTransaction.commit();

		System.out.println("Sign up successful");

	}

	public boolean loginUser(String email, String password) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, email);

		if (password.equals(user.getPassword())) {
			return true;
		}
		return false;

	}

	public void displayPasswords(String email) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, email);

		System.out.println(user);

	}

	public void facebookUser(String email, String facebook) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, email);
		user.setFacebook(facebook);

		entityTransaction.begin();

		entityManager.merge(user);

		entityTransaction.commit();

	}

	public void instagramUser(String email, String instagram) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, email);
		user.setInstagram(instagram);

		entityTransaction.begin();

		entityManager.merge(user);

		entityTransaction.commit();

	}

	public void snapchatUser(String email, String snapchat) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, email);
		user.setSnapchat(snapchat);

		entityTransaction.begin();

		entityManager.merge(user);

		entityTransaction.commit();

	}

	public void whatsappUser(String email, String whatsapp) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, email);
		user.setWhatsapp(whatsapp);

		entityTransaction.begin();

		entityManager.merge(user);

		entityTransaction.commit();

	}

	public void twitterUser(String email, String twitter) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user = entityManager.find(User.class, email);
		user.setTwitter(twitter);

		entityTransaction.begin();

		entityManager.merge(user);

		entityTransaction.commit();

	}

}
