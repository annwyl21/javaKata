public class DigitSumCalculator {
    public static void main(String[] args) {
        System.out.println(calculateDigitSum(156));
        System.out.println(stringDigitSum(156));
    }

    public static int stringDigitSum(int myNum){
        String myStr = Integer.toString(myNum);
        int result = 0;
        // System.out.println(myStr);
        for (char digit: myStr.toCharArray()){
            // System.out.println(digit);
            int digitValue = digit - '0';
            result += digitValue;
        }
        return result;
    }
    /*
When you iterate over the string representation of the number,
you get individual characters (digits).
To convert these characters to their integer equivalents,
you can subtract the character '0' from them.

For example, the character '3' has an integer value of 51 (in the ASCII table).
The character '0' has an integer value of 48.
So, '3' - '0' gives us 3, which is the integer value of the character '3'.
 */

    public static int calculateDigitSum(int myNum){
        int result = 0;
        while (myNum != 0){
            int lastDigit = myNum % 10;
            result += lastDigit;
            myNum /= 10;
        }
        return result;
    }

}

/*
a neat way of doing the same thing using the modulo remainder
 */