import java.util.HashSet;
import java.util.Set;
public class UniqueCharChecker {
    public static void main(String[] args) {
        System.out.println(hasUniqueChars("Ellen"));
        System.out.println(hasUniqueChars("Joseph"));
    }

    public static boolean hasUniqueChars(String word){
        Set<Character> myWord = new HashSet<>();

        // add the numbers from my array to my set
        for (char letter: word.toCharArray()){
            myWord.add(letter);
        }

        // if they are the same length return true
        return myWord.size() == word.length();

    }
}
