package algorithms;

public class SelectionSort {

    public static void main (String [] args){
        int []values = {3,1,9,5,6,2,2,7,8,11};
        selectionSort(values);

    }
    public static void selectionSort (int values[ ]) {
        int arrlen = values.length;

        for (int i = 0; i < arrlen - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arrlen; j++) {
                if (values[j] < values[smallest])
                    smallest = j;
            }

            int temp = values[smallest];
            values[smallest] = values[i];
            values[i] = temp;
        }
        for (int i = 0 ;i< values.length; i++){
            System.out.print(" "+values[i]);
        }
    }

}