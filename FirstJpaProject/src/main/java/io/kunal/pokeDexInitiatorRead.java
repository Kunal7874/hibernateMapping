package io.kunal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class pokeDexInitiatorRead {

	public static void main(String[] args) {
		
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("kunal");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Pokemon p=entityManager.find(Pokemon.class, "Pikachu");
		
		System.out.println(p);
	}

}
