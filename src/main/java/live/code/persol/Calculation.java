package live.code.persol;

import java.util.List;

public class Calculation {
    public static int calculateSum(List<Integer> numbers) throws EmptyListException {
        if(numbers == null || numbers.isEmpty()) {
            throw new EmptyListException("Input list cannot be empty");
        }
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
    
    public static class EmptyListException extends RuntimeException {
      private static final long serialVersionUID = 892211114748202008L;
      public EmptyListException(String message) {
        super(message);
    }
    }
}