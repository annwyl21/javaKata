public class VowelCounter {
    public static void main(String[] args) {
        System.out.println(countVowels("Ellen"));
    }

    public static Integer countVowels(String word){
        Integer counter = 0;
        String vowels = "aeiou";
        // convert to lowercase and an array of characters and cycle through
        for (char letter: word.toLowerCase().toCharArray()){
            // for each letter cycle through the vowel string
            for (int i=0; i<vowels.length(); i++){
                if (letter == vowels.charAt(i)){
                    counter++;
                }
            }
        }
        return counter;
    }
}
