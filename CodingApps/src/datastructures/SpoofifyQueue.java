package datastructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SpoofifyQueue {
    public static void main(String[] args) {
        char prompt = '>';
        Scanner input = new Scanner(System.in);
        Queue<String> nextUp = new LinkedList<>();

        while (true){
            String nswr = ask("What will you do? (Tap h for help)",prompt,input);
            System.out.println();

            if (nswr.equals("h")) {
                System.out.println("Options:\n" +
                        "add\n" +
                        "play next\n" +
                        "quit");
            } else if (nswr.equals("add")) {
                nswr = ask("Choose Song:",prompt,input);
                nextUp.add(nswr);
            } else if (nswr.equals("play next")){
                System.out.println(nextUp.remove());
            } else if (nswr.equals("quit")) {
                System.exit(1);
            }
        }
    }

    public static String ask(String question,char prompt, Scanner input){
        System.out.println(question);
        System.out.print(prompt);
        String answer = input.nextLine();
        return answer;
    }
}
