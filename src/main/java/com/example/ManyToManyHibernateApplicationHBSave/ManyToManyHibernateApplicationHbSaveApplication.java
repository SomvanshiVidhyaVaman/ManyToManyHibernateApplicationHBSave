package com.example.ManyToManyHibernateApplicationHBSave;

import com.example.ManyToManyHibernateApplicationHBSave.domain.Authors;
import com.example.ManyToManyHibernateApplicationHBSave.domain.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class ManyToManyHibernateApplicationHbSaveApplication {

	public static void main(String[] args) {
		StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
		SessionFactory sessionFactory= metadata.getSessionFactoryBuilder().build();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();

		Authors authors=new Authors();
		authors.setAuthors_Name("Vidhya Somvanshi");
		authors.setAuthors_Email("vidhyasomvanshi@1999.com");
		authors.setAuthors_Education("Bsc");

		Book book=new Book();
		book.setBook_Name("Math");
		book.setBook_Edition("3.0");
		book.setBook_Publisher("Java publisher");

		authors.getBook().add(book);
		book.getAuthors().add(authors);

		session.persist(authors);

		Authors authors1=(Authors) session.get(Authors.class,1);
		Book book1=(Book) session.get(Book.class,1);

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Author Info>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Author Name>>>>>"+authors1.getAuthors_Name());
		System.out.println("Author Email>>>>>>"+authors1.getAuthors_Email());
		System.out.println("Author Education>>>>>>>>>>>>"+authors1.getAuthors_Education());

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<Book Info>>>>>>>>>>>>>>>>>>");



		System.out.println("Book Name>>>>"+book1.getBook_Name());
		System.out.println("Book publisher>>>>>>>>"+book1.getBook_Publisher());
		System.out.println("Book Edition>>>>>>>>"+book1.getBook_Edition());

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>");
		transaction.commit();
		session.close();
		System.out.println("Data has been succeefully saved");

	}

}
