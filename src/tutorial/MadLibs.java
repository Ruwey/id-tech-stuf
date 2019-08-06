package tutorial;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        intro();
        char prompt = '>';

        String adjective = ask("Name an adjective.",prompt);
        String noun = ask("Name a noun.",prompt);
        String animal = ask("Name an animal.",prompt);
        String noise = ask("Name a noise.",prompt);
        printMadLib(adjective,noun,animal,noise);
    }

    public static String ask(String question,char prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(question);
        System.out.print(prompt);
        String answer = input.next();
        return answer;
    }

    public static void intro(){
        System.out.println("WELCOME TO \n" +
                " _____ ______   ________  ________          ___       ___  ________  ________      \n" +
                "|\\   _ \\  _   \\|\\   __  \\|\\   ___ \\        |\\  \\     |\\  \\|\\   __  \\|\\   ____\\     \n" +
                "\\ \\  \\\\\\__\\ \\  \\ \\  \\|\\  \\ \\  \\_|\\ \\       \\ \\  \\    \\ \\  \\ \\  \\|\\ /\\ \\  \\___|_    \n" +
                " \\ \\  \\\\|__| \\  \\ \\   __  \\ \\  \\ \\\\ \\       \\ \\  \\    \\ \\  \\ \\   __  \\ \\_____  \\   \n" +
                "  \\ \\  \\    \\ \\  \\ \\  \\ \\  \\ \\  \\_\\\\ \\       \\ \\  \\____\\ \\  \\ \\  \\|\\  \\|____|\\  \\  \n" +
                "   \\ \\__\\    \\ \\__\\ \\__\\ \\__\\ \\_______\\       \\ \\_______\\ \\__\\ \\_______\\____\\_\\  \\ \n" +
                "    \\|__|     \\|__|\\|__|\\|__|\\|_______|        \\|_______|\\|__|\\|_______|\\_________\\\n" +
                "                                                                       \\|_________|\n");
    }

    public static void printMadLib(String adjective, String noun, String animal, String noise){
        System.out.println(adjective + " Macdonald had a " + noun + ", E-I-E-I-O");
        System.out.println("and on that " + noun + " he had an " + animal + ", E-I-E-I-O");
        System.out.println("with a " + noise + " " + noise + " here");
        System.out.println("and a " + noise + " " + noise + " there,");
        System.out.println("here a " + noise + ", there a " + noise + ",");
        System.out.println("everywhere a " + noise + " " + noise + ",");
        System.out.println(adjective + " Macdonald had a " + noun + ", E-I-E-I-O.");
    }
}
