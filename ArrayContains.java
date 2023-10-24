import java.util.*;
public class ArrayContains {
    public static void main(String[] args) {
        System.out.println(check(new Object[]{66, 101}, 66));
        System.out.println(check(new Object[]{80, 117, 11}, 10));
    }

    public static boolean check(Object[] a, Object x){
        ArrayList<Object> myArr = new ArrayList<Object>(Arrays.asList(a));

        return myArr.contains(x);
        // return Arrays.asList(a).contains(x);
    }
}

/*
NOTES:
did not need to convert could have just returned this...
return Arrays.asList(a).contains(x);
 */