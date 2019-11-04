package mate.academy.boot.bookbootdemo.service;

import java.util.List;
import java.util.Optional;

import mate.academy.boot.bookbootdemo.entity.Book;

public interface BookService {

    void save(Book book);

    List<Book> findAll();

    Optional<Book> findById(Long id);

    void delete(Long id);

    Optional<Book> update(Long id, Book book);
}
