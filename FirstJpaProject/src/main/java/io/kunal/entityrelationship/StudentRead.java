package io.kunal.entityrelationship;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentRead {

	public static void main(String[] args) {
		
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kunal2");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		Student s1= entityManager.find(Student.class, 1);
		//System.out.println(s1.getName() + " " + s1.getCard().getCardNumber() + " " + s1.getCard().getSoftwareVersion());
		System.out.println(s1.getName());

	}

}
