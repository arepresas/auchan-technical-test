package technical.test.api.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import technical.test.api.model.Book;

@Repository
public interface BooksRepository extends ReactiveMongoRepository<Book, Integer> {}
