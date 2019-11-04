package mate.academy.boot.bookbootdemo.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BookDto {

    @NotNull
    @NotEmpty
    private String title;

    @NotNull
    @NotEmpty
    private Integer year;

    @NotNull
    @NotEmpty
    private Double price;
    private String description;

    public BookDto(@NotNull @NotEmpty String title, @NotNull @NotEmpty Integer year,
                   @NotNull @NotEmpty Double price) {
        this.title = title;
        this.year = year;
        this.price = price;
    }
}
