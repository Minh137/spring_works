package net.minh137.community;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.minh137.community.model.Post;
import net.minh137.community.service.BoardService;

@Controller
@RequestMapping("/posts")
public class BoardController {

    @Autowired
    private BoardService boardService;

    private static final int PAGE_SIZE = 10;

    // �Խù� ����Ʈ ������ ���� (����¡ ����)
    @GetMapping
    public String listPosts(@RequestParam(value = "page", defaultValue = "1") int page, Model model) {
        List<Post> posts = boardService.getPostsByPage(page, PAGE_SIZE);
        int totalPages = boardService.getTotalPages(PAGE_SIZE);

        model.addAttribute("posts", posts);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);
        
        return "postList";
    }

    // ���ο� �Խù� �ۼ� �� ������ ����
    @GetMapping("/posts/new")
    public String newPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "postForm";
    }

    // �Խù� �ۼ� ó�� ����
    @PostMapping("/posts")
    public String createPost(@ModelAttribute Post post, RedirectAttributes redirectAttributes) {
        try {
            boardService.createPost(post);
            redirectAttributes.addFlashAttribute("message", "Post created successfully");
        } catch (IllegalArgumentException e) {
            redirectAttributes.addFlashAttribute("error", e.getMessage());
            return "redirect:/posts/new";
        }
        return "redirect:/posts";
    }

    // �Խù� ���� �� ������ ����
    @GetMapping("/posts/{id}/edit")
    public String editPostForm(@PathVariable int id, Model model) {
        Post post = boardService.getPostById(id);
        model.addAttribute("post", post);
        return "postForm";
    }

    // �Խù� ���� ó�� ����
    @PostMapping("/posts/{id}")
    public String updatePost(@PathVariable int id, @ModelAttribute Post post, RedirectAttributes redirectAttributes) {
        try {
            post.setId(id);
            boardService.updatePost(post);
            redirectAttributes.addFlashAttribute("message", "Post updated successfully");
        } catch (IllegalArgumentException e) {
            redirectAttributes.addFlashAttribute("error", e.getMessage());
            return "redirect:/posts/" + id + "/edit";
        }
        return "redirect:/posts";
    }

    // �Խù� ���� ó�� ���� (GET -> POST ������� �����Ͽ� ���� ��ȭ)
    @PostMapping("/posts/{id}/delete")
    public String deletePost(@PathVariable int id, RedirectAttributes redirectAttributes) {
        boardService.deletePost(id);
        redirectAttributes.addFlashAttribute("message", "Post deleted successfully");
        return "redirect:/posts";
    }
}
