public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(binaryGap(9)); //2
        System.out.println(binaryGap(529)); //4
        System.out.println(binaryGap(20)); //1
        System.out.println(binaryGap(32)); //0
    }

    public static Integer binaryGap(int N) {
        Integer gap = 0;

        //make it a binary string
        String binaryString = Integer.toBinaryString(N);

        //cycle through string, reset count at 1 and increase count at 0
        Integer count = 0;
        for (int i=0; i<binaryString.length(); i++) {
            String digit = String.valueOf(binaryString.charAt(i));
            //System.out.println(digit);
            if (digit.equals("1")) {
                if (count > gap) {
                    gap = count; // collect largest count
                }
                count = 0;
            } else {
                count++;
            }
        }

        return gap;
    }
}
