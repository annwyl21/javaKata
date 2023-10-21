public class sumPosInt {
    public static void main(String[] args) {
        int[] intList = {1, 2, 3};
        System.out.println(sum(intList));
    }

    public static int sum(int[] myList) {
        int result = 0;
        for (int i: myList) {
            if (i > 0) {
                result += i;
            }
        }
        return result;
    }
}
