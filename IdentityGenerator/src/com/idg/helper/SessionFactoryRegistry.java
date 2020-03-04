package com.idg.helper;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry {
	private static SessionFactory mySqlsessionFactory;

	static {
		try {
			mySqlsessionFactory = new MetadataSources(
					new StandardServiceRegistryBuilder().configure("hibernate-mysql.cfg.xml").build()).buildMetadata()
							.buildSessionFactory();
		} catch (Throwable t) {
			t.printStackTrace();
			throw t;
		}
	}

	public static SessionFactory getMySqlsessionFactory() {
		return mySqlsessionFactory;
	}

	public static void closeSessioFactories() {
		if (mySqlsessionFactory != null) {
			mySqlsessionFactory.close();
		}
	}
}
