package live.code.persol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BookSearch {

    @Bean // add annotation
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean // add annotation
    public RecommendationService recommendationService(BookRepository bookRepository) {
        return new RecommendationService(bookRepository);
    }
}

@Component // add annotation
class RecommendationService {
    private final BookRepository repository;

    @Autowired // add medthod & annotation
    public RecommendationService(BookRepository repository) {
        this.repository = repository;
    }

    public String recommendBook() {
        return repository.getBooks().get(0);
    }
}

@Component // add annotation
class BookRepository {
    public List<String> getBooks() {
        List<String> books = new ArrayList<>();
        books.add("Book");
        books.add("Short book");
        books.add("Long book");

        return books;
    }
}
