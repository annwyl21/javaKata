public class AccessStringElements {
    public static void main(String[] args) {
        System.out.println(accessString("great blue heron","garlic nann"));
        System.out.println(accessString("chickadee","chocolate cake"));
        System.out.println(accessString("brown bear","bear claw"));
    }

    public static boolean accessString(String str1, String str2) {
        String startsWith = String.valueOf(str1.charAt(0));
        String endsWith = String.valueOf(str1.charAt(str1.length()-1));
        if (startsWith.equals(String.valueOf(str2.charAt(0))) && endsWith.equals(String.valueOf(str2.charAt(str2.length()-1)))) {
            return true;
        } else {
            return false;
        }
        // return startsWith.equals(String.valueOf(str2.charAt(0))) && endsWith.equals(String.valueOf(str2.charAt(str2.length()-1)))
        // will just return a boolean
    }
}
