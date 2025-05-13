import java.util.Scanner;

public class MyJavaApp{



    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // Take input from user and save it in a variable
        System.out.print("Please enter your name: ");
        String userName = scan.nextLine();


        //Taking two numbers as input and storing inside two variables respectively
        System.out.print("First number: ");
        String num1 = scan.nextLine();
        System.out.print("Second number: ");
        String num2 = scan.nextLine();
        System.out.println("The answer to " + num1 + " + " + num2 + " is " + (num1 + num2));


    }

}