package algorithms;

public class BinaryOfTheSearch {
    public static void main(String[] args) {
        int[] dates = {3, 4, 8, 12, 15, 17,18, 21, 23,  26, 28, 30};

        System.out.println(binarySearch(dates,29));
    }

    public static int binarySearch (int[] val, int x){
        int low = 0;
        int high = val.length - 1;
        while (low <= high) {
            int midpoint = (low + high) / 2;
            if (val[midpoint] == x) {
                return midpoint;
            } else if (val[midpoint] < x) {
                low = midpoint + 1;
            } else if (val[midpoint] > x) {
                high = midpoint -1;
            }
            System.out.println(midpoint);
        }
        return -1;
    }
}
