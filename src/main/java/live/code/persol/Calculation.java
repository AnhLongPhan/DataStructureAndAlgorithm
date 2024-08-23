package live.code.persol;

import java.util.List;
import java.util.Objects;

public class Calculation {
    public static int calculateSum(List<Integer> numbers) throws InvalidListException {
        if (numbers == null) {
            throw new EmptyListException("Input list cannot be null");
        }
        if (numbers.isEmpty()) {
            throw new EmptyListException("Input list cannot be empty");
        }
        if (numbers.stream().anyMatch(Objects::isNull)) {
            throw new EmptyListException("Input list cannot contain null elements");
        }

        // Optional: Add extra validation if you want to ensure no negative numbers are allowed
        if (numbers.stream().anyMatch(num -> num < 0)) {
            throw new EmptyListException("Input list cannot contain negative numbers");
        }s

        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
    
    public static class EmptyListException extends RuntimeException {
      private static final long serialVersionUID = 892211114748202008L;
      public EmptyListException(String message) {
        super(message);
    }
    }
}