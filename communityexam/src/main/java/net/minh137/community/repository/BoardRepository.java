package net.minh137.community.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import net.minh137.community.model.Post;

@Repository
public class BoardRepository {
	@Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Post> findAll() {
        return jdbcTemplate.query("SELECT * FROM posts", new BeanPropertyRowMapper<>(Post.class));
    }

    public Post findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM posts WHERE id = ?", new BeanPropertyRowMapper<>(Post.class), id);
    }

    public int save(Post post) {
        String sql = "INSERT INTO posts (title, content, author) VALUES (?, ?, ?)";
        return jdbcTemplate.update(sql, post.getTitle(), post.getContent(), post.getAuthor());
    }

    public int update(Post post) {
        String sql = "UPDATE posts SET title = ?, content = ?, author = ? WHERE id = ?";
        return jdbcTemplate.update(sql, post.getTitle(), post.getContent(), post.getAuthor(), post.getId());
    }

    public int delete(int id) {
        String sql = "DELETE FROM posts WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }
    
    public List<Post> findPostsByPage(int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        String sql = "SELECT * FROM posts ORDER BY created_at DESC LIMIT ? OFFSET ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Post.class), pageSize, offset);
    }

    public int countPosts() {
        String sql = "SELECT COUNT(*) FROM posts";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }
}
