package technical.test.api.endpoints;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import technical.test.api.model.Book;
import technical.test.api.services.BooksService;

import javax.validation.constraints.NotNull;

@RestController
@AllArgsConstructor
@Tag(name = "Books API")
@RequestMapping(value = AppEndpoints.BOOKS_BASE_URL)
public class BooksController {
  private final BooksService booksService;

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public Mono<Book> findById(@PathVariable @NotNull Integer id) {
    return booksService.findById(id);
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public Flux<Book> findAll() {
    return booksService.findAll();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void create(@RequestBody Book book) {
    booksService.create(book);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public void delete(@PathVariable Integer id) {
    booksService.delete(id);
  }
}
