package io.kunal.entityrelationship;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentCreate {

	public static void main(String[] args) {
	Student s1=new Student();
	s1.setName("Kunal");
	
	Student s2=new Student();
	s2.setName("Aman");
	
	StudentIdCard c1=new StudentIdCard();
	c1.setSoftwareVersion("1.0.1");
	
	StudentIdCard c2=new StudentIdCard();
	c2.setSoftwareVersion("1.0.2");
	
	s1.setCard(c1);
	s2.setCard(c2);
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kunal2");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	entityTransaction.begin();
	entityManager.persist(s1);
	entityManager.persist(s2);
	entityManager.persist(c1);
	entityManager.persist(c2);
	entityTransaction.commit();


	}

}
