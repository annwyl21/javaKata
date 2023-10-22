public class Switch {
    public static void main(String[] args) {
        System.out.println(switchItUp(2));
    }

    public static String switchItUp(int num){
        return switch (num) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Zero";
        };
    }

    public static String alt(int number){
        String[] numbers = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        return numbers[number];
    }
}
