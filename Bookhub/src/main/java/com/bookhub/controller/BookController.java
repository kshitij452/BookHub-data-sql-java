package com.bookhub.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;



// Also import your BookDAO and Book model classes
import com.bookhub.dao.BookDAO;
import com.bookhub.model.Book;
@Controller
@RequestMapping("/books")
public class BookController {
  @Autowired
  private BookDAO bookDAO;
  
  


  @GetMapping("/add")
  public String showAddBookForm(Model model) {
    model.addAttribute("book", new Book());
    return "addBook";
  }

  @PostMapping("/add")
  public String addBook(@ModelAttribute Book book) {
    bookDAO.save(book);
    return "redirect:/books/list";
  }

  @GetMapping("/list")
  public String viewBooks(Model model) {
    model.addAttribute("bookList", bookDAO.getAllBooks());
    return "viewBooks";
  }
  

}
