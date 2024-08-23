package oh.daijin.driveplus;

import java.util.Arrays;
import java.util.List;

public class test {
    public String findLongestWordLength(String input) {
        List <String> words = Arrays.asList(input.split(" "));
       String longest = "";
       for (String word : words) {
           if(longest.length() < word.length()) {
             longest = word;
           }
       }
        return longest;
     }
}
