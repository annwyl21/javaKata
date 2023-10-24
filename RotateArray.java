import java.util.ArrayList;
public class RotateArray {
    public static void main(String[] args) {
        // iterate over the result when printing
        int[] result = rotation(new int[]{3,8,9,7,6}, 3);
        for (int i: result){
            System.out.print(i + ", ");
        }
    }

    public static int[] rotation(int[] myArray, int k){
        // create an empty arraylist
        ArrayList<Integer> arrayToEdit = new ArrayList<Integer>();

        // add my array to new arraylist
        for (int num: myArray){
            arrayToEdit.add(num);
        }

        // pop last element from the array and add to start
        for (int i=k; i>0; i--){
            // pop last element
            int element = arrayToEdit.remove(arrayToEdit.size()-1);
            arrayToEdit.add(0, element);
        }

        // convert ArrayList back to array
        int[] rotatedArray = new int[arrayToEdit.size()];
        for (int i=0; i<arrayToEdit.size(); i++){
            rotatedArray[i] = arrayToEdit.get(i);
        }
        return rotatedArray;
    }
}
