import java.util.HashMap;
public class CharacterCount {
    public static void main(String[] args) {
        System.out.println(frequency("Hello", 'l'));
        System.out.println(frequency("Hello", 'o'));
        System.out.println(frequency("Hello", 'z'));
    }

    public static int frequency(String word, Character myLetter){
        // create empty dictionary
    HashMap<Character, Integer> frequencyCount = new HashMap<>();

    // convert string to an array of characters
        for (char letter: word.toCharArray()){
        if (frequencyCount.containsKey(letter)){
            int count = frequencyCount.get(letter);
            int updatedCount = count +1;
            frequencyCount.put(letter, updatedCount);
        } else {
            frequencyCount.put(letter, 1);
        }
    }

    // check for the character count
    // if the count is missing because the character did not exist return a 0 instead of 'null'
    Integer counted = frequencyCount.get(myLetter);
        return (counted != null) ? counted: 0; // example of using ternary operator
}
}
