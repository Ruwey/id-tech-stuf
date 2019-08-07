package datastructures;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("This is a string.");
        list.add("Other string");
        list.add("I hate stirings");

        System.out.println("The list:");
        for (String element : list){
            System.out.println("    " + element);
        }

        System.out.println("Second item in list:");
        System.out.println("    " + list.get(1));

        Integer i = 1;
    }
}
