package graphicsbasics;

public class EnumTest {
    public enum Day {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday
    }

    public static void main(String[] args) {
        int val = (new java.util.Random()).nextInt(4);
        switch (val) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("no");
                break;
        }
    }
}
