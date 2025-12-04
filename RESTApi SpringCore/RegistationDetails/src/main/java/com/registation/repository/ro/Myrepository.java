
package com.registation.repository.ro;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.registation.entity.io.Students;

@Repository
public class Myrepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void submitForm(Students students) {

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(students);
        tx.commit();
        session.close();   // IMPORTANT
        System.out.println("Registration complete...");
    }

	public List<Students> getStudentList() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		List<Students> list = session.createQuery("from Students", Students.class).list();
		session.close();
		return list;
	}
	
	// Update student
    public void update(Students student) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(student);
        tx.commit();
        session.close();
        System.out.println("Student updated...");
    }

    // Delete student
    public void delete(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Students student = session.get(Students.class, id);
        if (student != null) {
            session.delete(student);
            System.out.println("Student deleted...");
        }
        tx.commit();
        session.close();
    }
    
    // Find student by ID
    public Students findById(int id) {
        Session session = sessionFactory.openSession();
        Students student = session.get(Students.class, id);
        session.close();
        return student;
    }
    
    public void deleteAll() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.createMutationQuery("delete from Students").executeUpdate();
        tx.commit();
        session.close();
    }

}
