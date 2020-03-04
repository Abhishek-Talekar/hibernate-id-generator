package com.idg.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.idg.entities.Feedback;
import com.idg.helper.SessionFactoryRegistry;

public class IDGTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Feedback feedback = null;
		boolean flag = false;
		try {
			sessionFactory = SessionFactoryRegistry.getMySqlsessionFactory();
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			feedback = new Feedback();
			feedback.setDescription("Nice");
			feedback.setProductName("Note 10");
			feedback.setRating(5);
			feedback.setUserName("Michel");
			Object id = session.save(feedback);
			System.out.println(id);
			System.out.println(feedback);
			flag = true;
		} finally {
			if (transaction != null) {
				if (flag) {
					transaction.commit();
				} else {
					transaction.rollback();
				}
				SessionFactoryRegistry.closeSessioFactories();
			}
		}
	}
}
