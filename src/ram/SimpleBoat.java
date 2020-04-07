package ram;
import java.util.Scanner;
//Create a SimpleBoat interface which contain the method great,remindname,age,count,test and end.
public interface SimpleBoat {
    static Scanner sc = new Scanner(System.in);
    // This method has two parameters . which take name and year of invention.
    static void great(String assistantName, String inventedin) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + inventedin + ".");
        System.out.println("Please, remind me your name.");
    }
    // This method is use to print the name which we have already entered. 
    static void remindname() {
        String name = sc.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }
    // This method is use to print the age of any person by input the remainder of the age by 3,5 and 7.
    static void age() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = sc.nextInt();
        int rem5 = sc.nextInt();
        int rem7 = sc.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
    // This method is use to print the number using for loop.
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(i + "!");
        }
    }
    // This method is use to predict the correct option.
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.print("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int a = sc.nextInt();
        if (a == 4) {
            System.out.println("Please, try again.");
        }
        int b = sc.nextInt();
    }
    // this method is use to print the last line.
    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }

}
