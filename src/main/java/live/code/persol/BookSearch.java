package live.code.persol;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;
import java.util.*;

@Configuration
public class BookSearch{
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    public RecommendationService recommendationService() {
        return new RecommendationService();
    }
}
@Component

public BookRepository bookRepository() {
    return new BookRepository();
}
class RecommendationService {
    public BookRepository repository;
        
    public String recommendBook() {
        return repository.getBooks().get(0);
    }
}
@Component
class BookRepository {
    public List<String> getBooks() {
        List<String> books = new ArrayList<>();
        books.add("Book");
        books.add("Short book");
        books.add("Long book");
        
        return books;
    }
}