public class RemoveEmptySpace {
    public static void main(String[] args) {
        System.out.println(removeSpace("xx rr tt"));
    }

    public static String removeSpace(final String x){
        return x.replace(" ", "");
    }
}
