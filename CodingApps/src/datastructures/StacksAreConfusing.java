package datastructures;
import java.util.*;

public class StacksAreConfusing {
    public static void main(String[] args) {
        String pword = "tacocat";
        LinkedList<Character> word = new LinkedList<>();
        String rword = "";
        for (int i = 0; i < pword.length(); i++){
            word.push(pword.charAt(i));
        }

        while (!word.isEmpty()){
            rword = rword + word.pop();
        }
        if (pword.equals(rword)){
            System.out.println("It's a palendrome!");
        }else {
            System.out.println("No palendrome here");
        }
    }
}
