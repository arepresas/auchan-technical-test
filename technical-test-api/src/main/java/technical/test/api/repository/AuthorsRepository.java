package technical.test.api.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import technical.test.api.model.Author;

@Repository
public interface AuthorsRepository extends ReactiveMongoRepository<Author, Integer> {}
