package technical.test.renderer.services;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import technical.test.api.model.Book;

@Service
public class BooksService {

  private static final String BASE_URL = "http://localhost:8080/v1/books/";
  private final WebClient client = getWebClient();

  private WebClient getWebClient() {
    return WebClient.create(BASE_URL);
  }

  public Flux<Book> findAll() {
    return client.method(HttpMethod.GET).uri(BASE_URL).retrieve().bodyToFlux(Book.class);
  }

  public void delete(Integer id) {
    client
        .method(HttpMethod.DELETE)
        .uri(BASE_URL + id)
        .retrieve()
        .bodyToMono(Void.class)
        .subscribe();
  }

  public void save(Book book) {
    client
        .method(HttpMethod.POST)
        .uri(BASE_URL)
        .body(Mono.just(book), Book.class)
        .retrieve()
        .bodyToMono(Void.class)
        .subscribe();
  }
}
