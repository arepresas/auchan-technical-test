package technical.test.api.endpoints;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import technical.test.api.model.Author;
import technical.test.api.services.AuthorsService;

import javax.validation.constraints.NotNull;

@RestController
@AllArgsConstructor
@Tag(name = "Authors API")
@RequestMapping(value = AppEndpoints.AUTHORS_BASE_URL)
public class AuthorsController {

  private final AuthorsService authorsService;

  @GetMapping("/{id}")
  public ResponseEntity<Mono<Author>> findById(@PathVariable @NotNull Integer id) {
    return new ResponseEntity<>(authorsService.findById(id), HttpStatus.OK);
  }

  @GetMapping
  public ResponseEntity<Flux<Author>> findAll() {
    return new ResponseEntity<>(authorsService.findAll(), HttpStatus.OK);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void create(@RequestBody Author author) {
    authorsService.create(author);
  }
}
