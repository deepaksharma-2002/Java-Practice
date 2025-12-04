package com.mypassword.service.dao.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mypassword.service.entity.PasswordHistory;
import com.mypassword.service.entity.Users;


@Repository
public class UserDao {
	 @Autowired
	    private SessionFactory sessionFactory;
	 	
	 // insert the data in the users table
	 	public void saveUserDetails(Users user) {
		   Session session = sessionFactory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.save(user);
	        session.close();
	 	}
	 
	 	public Users getUserById(int id) {
	 		Session session =  sessionFactory.openSession();
	 		Users user  = session.get(Users.class, id);
	 		session.close();
	 		return user;
	 	}

	 	public Users findByEmail(String email) {
	 	    Session session = sessionFactory.openSession();
	 	    
	 	    String hql = "FROM Users WHERE email = :email";
	 	    Users user = session.createQuery(hql, Users.class)
	 	                        .setParameter("email", email)
	 	                        .uniqueResult();
	 	    
	 	    session.close();
	 	    return user;
	 	}


	    public void updatepassword(Users user) {
	        Session session = sessionFactory.openSession();
	        Transaction tx = session.beginTransaction();
	        session.update(user);
	        tx.commit();
	        session.close();
	    }
	    	
	    
	    // insert the data in the passwordHistory table
		public void saveoldPass(PasswordHistory passwordHistory) {
			   Session session = sessionFactory.openSession();
		        Transaction tx = session.beginTransaction();
		        session.save(passwordHistory);
		        session.close();
		}
		
		
		@SuppressWarnings("unchecked")
		public List<PasswordHistory> getLastThreePassword(String email) {
		    Session session = sessionFactory.openSession();
		    List<PasswordHistory> list = session.createQuery(
		        "from PasswordHistory where email = :mail order by id desc")
		    		.setParameter("mail", email)
		    		.setMaxResults(3)
		    		.list();
		    session.close();
		    return list;
		}

		@SuppressWarnings("unchecked")
		public List<PasswordHistory> getLastThreePassword(int userId) {
		    Session session = sessionFactory.openSession();

		    List<PasswordHistory> list = session
		            .createQuery("from PasswordHistory where userId = :uid order by id desc")
		            .setParameter("uid", userId)
		            .setMaxResults(3)
		            .list();

		    session.close();
		    return list;
		}

		
}
