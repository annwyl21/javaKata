public class AverageGrade {
    public static void main(String[] args) {
        System.out.println(getGrade(95, 90, 93));
        System.out.println(alt(95, 90, 93));
    }

    public static char getGrade(int a, int b, int c){
        int avScore = (a + b + c)/3;

        if (avScore >= 90) {
            return 'A';
        } else if (avScore >= 80) {
            return 'B';
        } else if (avScore >= 70) {
            return 'C';
        }else if (avScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static char alt(int a, int b, int c){
        switch ((a+b+c)/30){
            case 10:
            case 9: return 'A';
            case 8: return 'B';
            case 7: return 'C';
            case 6: return 'D';
            default: return 'F';
        }
    }
}

// notes
// single quotes to return a char instead of a string
// Integer is not needed for the basic maths, int is fine
// return "FFFFFFDCBAA".charAt((s1+s2+s3)/30); this was a clever solution too, better than my if else