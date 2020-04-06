package ram;
import java.util.Scanner;

public class SimpleBoat {
    static Scanner sc = new Scanner(System.in);

    static void great(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindname() {
        String name = sc.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

}
