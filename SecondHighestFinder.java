import java.util.Arrays;

public class SecondHighestFinder {
    public static void main(String[] args) {
        System.out.println(findSecondHighest(new int[] {1,2,3,4,5}));
        System.out.println(sortArray(new int[] {1,2,3,4,5}));
    }

    public static int findSecondHighest(int[] myIntArr){
        Integer highest = Integer.MIN_VALUE; // like using inf in Python for the largest possible number except here it is the smallest possible
        Integer secondHighest = 0;

        for (Integer num: myIntArr){
            if (num > highest){
                secondHighest = highest;
                highest = num;
            }
        }

        return secondHighest;
    }

    public static int sortArray(int[] myIntArr){
        Arrays.sort(myIntArr); // disadvantage is that this changes the original array & is less efficient than above method
        Integer secondToLast = myIntArr.length -2;

        return myIntArr[secondToLast];
    }
}
