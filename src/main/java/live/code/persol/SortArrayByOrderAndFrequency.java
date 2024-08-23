package oh.daijin.driveplus;

import java.util.*;
import java.util.stream.IntStream;

public class SortArrayByOrderAndFrequency {

    public static void main(String[] args) {
        int[] array = {10, 5, 7, 2, 5, 7, 9, 10, 10, 2, 5, 7, 7};

        System.out.println("Original array: " + Arrays.toString(array));

        List<Integer> sortedArray = sortByOrderAndFrequency(array);
        System.out.println("Sorted array by natural order and frequency: " + sortedArray);
    }

    public static List<Integer> sortByOrderAndFrequency(int[] array) {
      Integer[] sortedArray = IntStream.of(array).boxed().toArray(Integer[]::new);
      Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number: sortedArray){
          frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        Arrays.sort(sortedArray, (a,b) -> {
          int order = frequencyMap.get(a).compareTo(frequencyMap.get(b));
          if (order == 0) return a.compareTo(b);
          return order;
        });
      return new ArrayList<>();
    }
}