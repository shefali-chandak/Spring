package com.example.jdbc.repository;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.jdbc.model.Book;

@Repository
public class BookRepositoryImpl implements BookRepository{

	@Autowired
	private EntityManager em; 
	
	@Override
	public int insertBook(Book b) {
		Session session = em.unwrap(Session.class);
		return (int)session.save(b);
	}

	@Override
	public int updateBook(String bookName, float price) {
		Session session = em.unwrap(Session.class);
		Query query = session.createQuery("update Book set price=:x where bookName=:y");
		query.setParameter("x", price);
		query.setParameter("y", bookName);
		return query.executeUpdate();
	}

	@Override
	public void deleteBook(int bid) {
		Session session = em.unwrap(Session.class);
		Book b = session.get(Book.class,bid);
		session.delete(b);
	}

	@Override
	public List<Book> getAllBooks() {
		Session session = em.unwrap(Session.class);
		Query query = session.createQuery("from Book");
		return query.getResultList();
	}
}
