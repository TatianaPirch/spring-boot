package mate.academy.boot.bookbootdemo.controller;

import javax.annotation.PostConstruct;

import mate.academy.boot.bookbootdemo.entity.Book;
import mate.academy.boot.bookbootdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

    @Autowired
    private BookService bookService;

    @PostConstruct
    public void initData() {
        saveBooks();
    }

    private void saveBooks() {
        Book goblinReservation = new Book("The Goblin Reservation", 1968, 100.);
        bookService.save(goblinReservation);
        goblinReservation.setDescription("Kids like this book");
        Book city = new Book("City", 1952, 200.);
        bookService.save(city);
        Book aliceInWonderland = new Book("Alice in Wonderland", 1865, 150.);
        bookService.save(aliceInWonderland);
        Book foundation = new Book("Foundation", 1942, 250.);
        bookService.save(foundation);
    }
}
