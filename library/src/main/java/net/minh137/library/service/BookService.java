package net.minh137.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.minh137.library.dao.BookDao;
import net.minh137.library.model.Book;

@Service
public class BookService {
	
	private BookDao bookDao;

	@Autowired
    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }
	

    public void insertBook(Book book) {


        List<Book> existingBooks = bookDao.getAllbook();
        boolean isbnExists = existingBooks.stream().anyMatch(b -> b.getIsbn().equals(book.getIsbn()));
        if (isbnExists) {
            throw new IllegalArgumentException("�̹� �����ϴ� ISBN�Դϴ�.");
        }


        bookDao.insertBook(book);
    }


    public void updateBook(Book book) {

        Book existingBook = bookDao.getBook(book.getId());
        if (existingBook == null) {
            throw new IllegalArgumentException("�������� �ʴ� �����Դϴ�.");
        }


        if (book.getTitle() == null || book.getTitle().trim().isEmpty()) {
            throw new IllegalArgumentException("���� ������ �ʼ��Դϴ�.");
        }


        bookDao.updateBook(book);
    }


    public void delBook(int id) {
        // ����Ͻ� ����: �����Ϸ��� ������ �����ϴ��� Ȯ��
        Book existingBook = bookDao.getBook(id);
        if (existingBook == null) {
            throw new IllegalArgumentException("�����Ϸ��� ������ �������� �ʽ��ϴ�.");
        }

        // ������ ����
        bookDao.delBook(id);
    }

    // ID�� ���� ��ȸ
    public Book getbook(int id) {
        // ����Ͻ� ����: ���� ���� ���� Ȯ��
        Book book = bookDao.getBook(id);
        if (book == null) {
            throw new IllegalArgumentException("�������� �ʴ� �����Դϴ�.");
        }
        return book;
    }

    // ��� ���� ��ȸ
    public List<Book> getAllbook() {
        return bookDao.getAllbook();
    }
}
