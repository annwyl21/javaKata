public class Rounding {
    public static void main(String[] args) {
        System.out.println(litres(5));
    }

    public static Integer litres(double hours) {
        //double water = hours * 0.5;
        return (int) java.lang.Math.floor(hours * 0.5);
    }
}
