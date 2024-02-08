package io.kunal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class pokeDexInitiatorCreate {

	public static void main(String[] args) {
		Pokemon p1=new Pokemon();
		p1.setName("Pikachu");
		p1.setPower(100);
		p1.setType("Electric");
		
		Pokemon p2=new Pokemon();
		p2.setName("Charizard");
		p2.setPower(200);
		p2.setType("Fire");
		
		Pokemon p3=new Pokemon();
		p3.setName("Meowth");
		p3.setPower(80);
		p3.setType("Cat");
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("kunal");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();	
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityTransaction.commit();
		
	
	}

}
