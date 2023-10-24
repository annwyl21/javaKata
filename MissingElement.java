import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {2,3,1,5}));
        System.out.println(solution(new int[] {}));
        System.out.println(solution(new int[] {1, 2}));
    }

    public static int solution(int[] A){
        Arrays.sort(A); // changes original array

        // check against a count
        int count = 1;
        for (int element: A){
            if (element != count){
                return count;
            } else {
                count++;
            }
        }
        return count;
    }
}
