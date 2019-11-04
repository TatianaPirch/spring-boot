package mate.academy.boot.bookbootdemo.controller;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityNotFoundException;

import mate.academy.boot.bookbootdemo.dto.BookDto;
import mate.academy.boot.bookbootdemo.dto.BookDtoUtil;
import mate.academy.boot.bookbootdemo.entity.Book;
import mate.academy.boot.bookbootdemo.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping
    public void add(@RequestBody BookDto bookDto) {
        Book book = BookDtoUtil.createBookFromDto(bookDto);
        bookService.save(book);
    }

    @GetMapping
    public List<Book> allBooks() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable("id") Long id) {
        return bookService.findById(id).orElseThrow(() ->
                new EntityNotFoundException("No book with id: " + id));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        bookService.delete(id);
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable("id") Long id, @RequestBody BookDto bookDto) {
        Book book = BookDtoUtil.createBookFromDto(bookDto);
        Optional<Book> bookOptional = bookService.update(id, book);
        return bookOptional.orElse(null);
    }
}

