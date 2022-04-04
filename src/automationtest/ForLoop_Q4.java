package automationtest;

import java.util.Scanner;

public class ForLoop_Q4 {

    public static void main(String[] args) {
        //Calling scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name howManyTime's you want to print: ");
        int i = scanner.nextInt();

        // Calling method in to main method
        ForLoop_Q4 obj = new ForLoop_Q4();
        obj.printMyName("Rinky ",i);

    }

    public void printMyName(String name, int howManyTime){
     //   String name = "Rinky";
        // Using for loop to print name
        int i = howManyTime;

        for (int j = 1; j <= i; j++ ){
            System.out.println( name + j);
        }
    }
}
