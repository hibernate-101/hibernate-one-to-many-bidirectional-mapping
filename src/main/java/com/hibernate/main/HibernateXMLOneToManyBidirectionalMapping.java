package com.hibernate.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.model.Cart;
import com.hibernate.model.Items;
import com.hibernate.util.HibernateUtil;

public class HibernateXMLOneToManyBidirectionalMapping {
	public static void main(String[] args) {
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.getCurrentSession();
		tx = session.beginTransaction();
		Cart cart = new Cart();
		cart.setName("MyCart");
		// One to many
		Items item1 = new Items("101", 3 * 100, 3, cart);
		Items item2 = new Items("102", 2 * 100, 2, cart);
		Items item3 = new Items("103", 1 * 50, 1, cart);
		cart.setTotal(item1.getItemTotal() + item2.getItemTotal()
				+ item3.getItemTotal());
		// one to many
		// Here we are saving cart object,its shows one-to-many
		Set s = new HashSet();
		s.add(item1);
		s.add(item2);
		s.add(item3);
		/*
		 * cart.setItem(s); session.save(cart);
		 */

		// many to one
		// Here we are saving child object,many-to-one

		item1.setCart(cart);
		item2.setCart(cart);
		item3.setCart(cart);

		session.save(item1);
		session.save(item2);
		session.save(item3);

		tx.commit();
		System.out.println("One to many Bi-directinal mapping done");
		sessionFactory.close();

	}

}
