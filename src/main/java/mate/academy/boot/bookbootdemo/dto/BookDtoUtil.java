package mate.academy.boot.bookbootdemo.dto;

import mate.academy.boot.bookbootdemo.entity.Book;

public class BookDtoUtil {

    public static Book createBookFromDto(BookDto bookDto) {
        Book book = new Book();
        book.setTitle(bookDto.getTitle());
        book.setPrice(bookDto.getPrice());
        book.setYear(bookDto.getYear());
        book.setDescription(bookDto.getDescription());
        return book;
    }
}
