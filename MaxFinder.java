public class MaxFinder {
    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1,2,3,4,5}));
    }

    public static Integer findMax(int[] myIntArr){
        // return the first value unless another replaces it
        Integer maxValue = myIntArr[0];

        for (int element: myIntArr){
            if (element > maxValue){
                maxValue = element;
            }
        }

        return maxValue;
    }
}
