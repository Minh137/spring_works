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
            throw new IllegalArgumentException("이미 존재하는 ISBN입니다.");
        }


        bookDao.insertBook(book);
    }


    public void updateBook(Book book) {

        Book existingBook = bookDao.getBook(book.getId());
        if (existingBook == null) {
            throw new IllegalArgumentException("존재하지 않는 도서입니다.");
        }


        if (book.getTitle() == null || book.getTitle().trim().isEmpty()) {
            throw new IllegalArgumentException("도서 제목은 필수입니다.");
        }


        bookDao.updateBook(book);
    }


    public void delBook(int id) {
        // 비즈니스 로직: 삭제하려는 도서가 존재하는지 확인
        Book existingBook = bookDao.getBook(id);
        if (existingBook == null) {
            throw new IllegalArgumentException("삭제하려는 도서가 존재하지 않습니다.");
        }

        // 데이터 삭제
        bookDao.delBook(id);
    }

    // ID로 도서 조회
    public Book getbook(int id) {
        // 비즈니스 로직: 도서 존재 여부 확인
        Book book = bookDao.getBook(id);
        if (book == null) {
            throw new IllegalArgumentException("존재하지 않는 도서입니다.");
        }
        return book;
    }

    // 모든 도서 조회
    public List<Book> getAllbook() {
        return bookDao.getAllbook();
    }
}
