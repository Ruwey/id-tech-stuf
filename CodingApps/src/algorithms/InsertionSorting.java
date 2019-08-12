package algorithms;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] values =  {5,3,3,1,4,6,2,8,7,9,0};
        insertionSort(values);
    }

    public static void insertionSort(int[] value){
        int arrlegth = value.length;

        for (int i = 0; i < arrlegth; i++) {
            int compare = i - 1;
            int currentVal = value[i];

            while (compare >= 0 && value[compare] > currentVal) {
                value[compare + 1] = value[compare];
                compare--;
            }
            value[compare + 1] = currentVal;
        }
        for (int i = 0; i < arrlegth; i++){
            System.out.print(" " + value[i]);
        }
    }
}
