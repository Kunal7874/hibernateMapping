package io.kunal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class pokeDexInitiatorDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("kunal");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();	
		
		Pokemon p=entityManager.find(Pokemon.class, "Pikachu");
		
		if(p!=null) {
		entityTransaction.begin();
		entityManager.remove(p);
		entityTransaction.commit();
		}
		else {
			System.out.println("D.N.E");
		}
	}

}
