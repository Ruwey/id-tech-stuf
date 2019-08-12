package algorithms;

public class MergeSorted {
    public static void main(String[] args) {
        int[] val = {12,30,30,7,3,11,9,27,17,23,24,15,1,29,29,15,2,1,7,20};
        mergeSort(val,0,val.length);
    }

    public static void merge(int values[], int low, int middle, int high){
        // Create Temporary copy of values
        int[] temp = new int[values.length];
        for (int i = low; i <= high; i++){
            temp[i] = values[i];
        }

        // Set basic variables
        int firstHalf = low;
        int secondHalf = middle + 1;
        int mergedIndex = low;

        while (temp[firstHalf] <= middle && temp[secondHalf] <= high) {
            if (temp[firstHalf] <= temp[secondHalf]){
                values[mergedIndex] = temp[firstHalf];
                firstHalf++;
            } else {
                values[mergedIndex] = temp[secondHalf];
                secondHalf++;
            }
            mergedIndex++;
        }

        while (firstHalf <= middle) {
            values[mergedIndex] = temp[firstHalf];
            mergedIndex++;
            firstHalf++;
        }
    }
    public static void mergeSort(int[] values, int low, int high){
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(values,low,middle);
            mergeSort(values,middle + 1, high);
            merge(values,low,middle,high);
        }
    }
}
