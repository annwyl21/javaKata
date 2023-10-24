import java.util.*;

public class RemoveElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeElement(new Object[]{"Keep", "Remove", "Keep", "Remove"})));
    }

    public static Object[] removeElement(Object[] arr) {
        // create empty arrayList of objects
        ArrayList<Object> myList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                myList.add(arr[i]);
        }
        return myList.toArray();
    }

}


