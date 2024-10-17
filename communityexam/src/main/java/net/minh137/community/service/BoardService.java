package net.minh137.community.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.minh137.community.model.Post;
import net.minh137.community.repository.BoardRepository;

@Service
public class BoardService {
	@Autowired
    private BoardRepository boardRepository;

    public List<Post> getAllPosts() {
        return boardRepository.findAll();
    }

    public Post getPostById(int id) {
        return boardRepository.findById(id);
    }

    public void createPost(Post post) {
        validatePost(post);
        boardRepository.save(post);
    }

    public void updatePost(Post post) {
        validatePost(post);
        boardRepository.update(post);
    }

    public void deletePost(int id) {
        boardRepository.delete(id);
    }

    private void validatePost(Post post) {
        if (post.getTitle() == null || post.getTitle().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        if (post.getContent() == null || post.getContent().isEmpty()) {
            throw new IllegalArgumentException("Content cannot be empty");
        }
    }
    
    public List<Post> getPostsByPage(int page, int pageSize) {
        return boardRepository.findPostsByPage(page, pageSize);
    }

    public int getTotalPages(int pageSize) {
        int totalPosts = boardRepository.countPosts();
        return (int) Math.ceil((double) totalPosts / pageSize);
    }
}
