public class FrequencyCount {
    public static void main(String[] args) {
        Integer[] myArr = {2, 1, 1, 2, 3, 1};
        System.out.println(frequencyCount(myArr)); //3 distinct values
    }

    public static Integer frequencyCount(Integer[] myArr) {
            // create empty frequency dictionary
            java.util.HashMap<Integer, Integer> frequency = new java.util.HashMap<Integer, Integer>();

            // cycle through array add 1 to value count, else add key
            for (Integer element: myArr) {
                //System.out.println(element);
                frequency.put(element, frequency.getOrDefault(element, 0) +1);
            }

            // return the length of the dictionary
            return frequency.keySet().size();
        }
}
