package com.bookhub.dao;
import com.bookhub.model.Book;
import java.util.List;
public interface BookDAO {
    void save(Book book);
    List<Book> getAllBooks();
}
