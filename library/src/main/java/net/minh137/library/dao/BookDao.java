package net.minh137.library.dao;

import java.util.List;

import net.minh137.library.model.Book;

public interface BookDao {
	List<Book> getAllbook();
	Book getBook(int id);
	void insertBook(Book book);
	void updateBook(Book book);
	void delBook(int id);
}
