package technical.test.api.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import technical.test.api.model.Book;
import technical.test.api.repository.BooksRepository;

@Service
@AllArgsConstructor
public class BooksService {
  private final BooksRepository bookRepository;

  public void create(Book book) {
    bookRepository.save(book).subscribe();
  }

  public Mono<Book> findById(Integer id) {
    return bookRepository.findById(id);
  }

  public Flux<Book> findAll() {
    return bookRepository.findAll();
  }

  public void delete(Integer id) {
    bookRepository.deleteById(id).subscribe();
  }
}
