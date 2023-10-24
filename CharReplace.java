public class CharReplace {
    public static void main(String[] args) {
        System.out.println(charReplace("GCAT"));
    }

    public static String charReplace(String dna){
//        String rna = "";
//
//        for (char letter: dna.toCharArray()){
//            if (letter == 'T'){
//                rna += 'U';
//            } else {
//                rna += letter;
//            }
//        }
//
//        return rna;

        return dna.replaceAll("T", "U");
    }
}
