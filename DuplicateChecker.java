import java.util.HashSet; // doing this makes the code easier to read
import java.util.Set; // importing the interface
public class DuplicateChecker {
    public static void main(String[] args) {
        System.out.println(hasDuplicates(new int[] {1,1,2,3}));
        System.out.println(hasDuplicates(new int[] {1,4,2,3}));
    }

    public static boolean hasDuplicates(int[] arrToCheck){
        // create an empty set
        Set<Integer> mySet = new HashSet<>();

        // add the numbers from my array to my set
        for (int num: arrToCheck){
            mySet.add(num);
        }

        // if they are the same length return true
        return mySet.size() == arrToCheck.length;
        // arrays have a length attribute not a length method so no () needed
    }
}
