package technical.test.api.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import technical.test.api.model.Author;
import technical.test.api.repository.AuthorsRepository;

@Service
@AllArgsConstructor
public class AuthorsService {
  private final AuthorsRepository authorRepository;

  public void create(Author author) {
    authorRepository.save(author).subscribe();
  }

  public Mono<Author> findById(Integer id) {
    return authorRepository.findById(id);
  }

  public Flux<Author> findAll() {
    return authorRepository.findAll();
  }
}
