public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Ellen"));
        System.out.println(isPalindrome("noon"));
    }

    public static boolean isPalindrome(String text){
        text = text.toLowerCase();
        int x = 0;

        for (int i=text.length()-1; i >= 0; i--){
            char end = text.charAt(i);
            if (end != text.charAt(x)){
                return false;
            } else {
                x++;
            }

        }
        return true;
    }
}

/*
Learning Points here:
DATATYPES - String and char
strings are compared with .equals but char are compared with ==

 */