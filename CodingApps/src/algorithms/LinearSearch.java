package algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] entries = {32, 14, 89, 62, 10, 20, 88, 40, 22, 91, 88, 65};
        int solution = LinearSearch.linearSearch(entries, 88);
        System.out.println(entries[solution]);
        System.out.println(entries[solution]);
    }
    public static int linearSearch(int[] list, int solution){
        for (int i = 0; i <= list.length; i++){
            if (solution == list[i]){
                return i;
            }
        }
        return  -1;
    }
}
