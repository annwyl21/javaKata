public class StringReverser {
    public static void main(String[] args) {
        System.out.println(reverse("Ellen"));
    }

    public static String reverse(String myString){
        // strings are immutable so create a variable to hold new string
        String myStringReversed = "";

        // cycle backwards through the string
        for (int i=myString.length()-1; i>=0; i--){
            // append each letter to the new string
            myStringReversed += myString.charAt(i);
        }

        // return the new string
        return myStringReversed;
    }
}
