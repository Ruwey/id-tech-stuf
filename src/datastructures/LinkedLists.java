package datastructures;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        // Create list
        LinkedList<String> students = new LinkedList<String>();

        // Add Students
        students.add("Larry");
        students.add("Barry");
        students.add("Jerry");

        // Print Students
        System.out.println("Student Roster: " + students);
    }
}
