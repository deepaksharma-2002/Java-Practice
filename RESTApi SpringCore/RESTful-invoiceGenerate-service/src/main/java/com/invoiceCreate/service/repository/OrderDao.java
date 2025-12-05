package com.invoiceCreate.service.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.invoiceCreate.service.Entity.OrderTable;

@Repository
public class OrderDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void insetVal(OrderTable orderTable) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(orderTable);
		transaction.commit();
		session.close();
	}
	
	public OrderTable findBtId(int id) {
		Session session = sessionFactory.openSession();
		OrderTable order = session.get(OrderTable.class, id);
		session.close();
		return order;
	}
	
	
}
