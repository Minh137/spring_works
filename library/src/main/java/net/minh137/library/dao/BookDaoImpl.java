package net.minh137.library.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import net.minh137.library.model.Book;

@Repository
public class BookDaoImpl implements BookDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Book> getAllbook() {
		String sql = "SELECT * FROM books";
        return jdbcTemplate.query(sql, new BookMapper());
	}

	@Override
	public Book getBook(int id) {
		String sql = "SELECT * FROM books WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new BookMapper(), id);
	}

	@Override
	public void insertBook(Book book) {
		String sql = "INSERT INTO books (title, author, isbn, published_year) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, book.getTitle(), book.getAuthor(), book.getIsbn(), book.getPublishedYear());

	}

	@Override
	public void updateBook(Book book) {
		String sql = "UPDATE books SET title = ?, author = ?, isbn = ?, published_year = ? WHERE id = ?";
        jdbcTemplate.update(sql, book.getTitle(), book.getAuthor(), book.getIsbn(), book.getPublishedYear(), book.getId());

	}

	@Override
	public void delBook(int id) {
		String sql = "DELETE FROM books WHERE id = ?";
        jdbcTemplate.update(sql, id);

	}
	
	 private static class BookMapper implements RowMapper<Book> {
	        @Override
	        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Book book = new Book();
	            book.setId(rs.getInt("id"));
	            book.setTitle(rs.getString("title"));
	            book.setAuthor(rs.getString("author"));
	            book.setIsbn(rs.getString("isbn"));
	            book.setPublishedYear(rs.getInt("published_year"));
	            
	            return book;
	        }
	    }

}
