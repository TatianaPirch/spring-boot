package mate.academy.boot.bookbootdemo.repository;

import mate.academy.boot.bookbootdemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
