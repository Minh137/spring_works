package net.minh137.library;


import java.util.List;
import java.util.Locale;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.minh137.library.model.Book;
import net.minh137.library.service.BookService;


@Controller
public class BookController {
	
	 private final BookService bookService;

	    @Autowired
	    public BookController(BookService bookService) {
	        this.bookService = bookService;
	    }

	    @GetMapping
	    public String getAllbook(Model model) {
	        List<Book> bookList = bookService.getAllbook();
	        model.addAttribute("bookList", bookList);
	        return "books";  // JSP 파일 이름 ("books.jsp"가 호출됨)
	    }

	    @RequestMapping(value = "/", method = RequestMethod.GET)
		public String books(Locale locale, Model model) {
	    	List<Book> bookList = bookService.getAllbook();
	        model.addAttribute("bookList", bookList);
			return "books";
		}

	    @GetMapping("/view")
	    public String viewBookDetails(@RequestParam int id, Model model) {
	        Book book = bookService.getbook(id);
	        model.addAttribute("book", book);
	        return "view";  
	    }
	    
	    @GetMapping("/write")
	    public String showAddBookForm() {
	        return "write";  
	    }
	    
	    @GetMapping("/edit")
	    public String showEditBookForm(@RequestParam int id, Model model) {
	        Book book = bookService.getbook(id);
	        model.addAttribute("book", book);
	        return "edit";  
	    }
	    
	    @GetMapping("/del")
		public String showDelBookForm(@RequestParam int id, Model model) {
	    	bookService.delBook(id);
			return "redirect:/";
		}

	    @PostMapping("/add")
	    public String insertBook(@RequestParam String title,
	                            @RequestParam String author,
	                            @RequestParam String isbn,
	                            @RequestParam int publishedYear) {
	        Book book = new Book();
	        book.setTitle(title);
	        book.setAuthor(author);
	        book.setIsbn(isbn);
	        book.setPublishedYear(publishedYear);
	        bookService.insertBook(book);
	        return "redirect:/";
	    }
	    

	    @PostMapping("/update")
	    public String updateBook(@RequestParam int id,
	                             @RequestParam String title,
	                             @RequestParam String author,
	                             @RequestParam String isbn,
	                             @RequestParam int publishedYear) {
	        Book book = new Book();
	        book.setId(id);
	        book.setTitle(title);
	        book.setAuthor(author);
	        book.setIsbn(isbn);
	        book.setPublishedYear(publishedYear);
	        bookService.updateBook(book);
	        return "redirect:/";
	    }
	}


