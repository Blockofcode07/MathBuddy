import java.util.Scanner;

public class MyJavaApp{



    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        // Take input from user and save it in a variable
        System.out.print("Please enter your name: ");
        String userName = scan.nextLine();


        int n1 = 4;
        int n2 = 9;
        int userAnswer;

        String question = "What is " + n1 + " + " + n2 + "? "; 
        System.out.print(question);
        userAnswer = scan.nextInt();
        System.out.println("Your answer is: "+ userAnswer);
        // Calculating the correct answer
        System.out.println("The correct answer is: " + (n1 + n2));
        
        question = "What is " + n1 + " - " + n2 + "? "; 
        System.out.print(question);
        userAnswer = scan.nextInt();
        System.out.println("Your answer is: "+ userAnswer);
        // Calculating the correct answer
        System.out.println("The correct answer is: " + (n1 - n2));

        question = "What is " + n1 + " * " + n2 + "? "; 
        System.out.print(question);
        userAnswer = scan.nextInt();
        System.out.println("Your answer is: "+ userAnswer);
        // Calculating the correct answer
        System.out.println("The correct answer is: " + (n1 * n2));

        question = "What is " + n1 + " / " + n2 + "? "; 
        System.out.print(question);
        userAnswer = scan.nextInt();
        System.out.println("Your answer is: "+ userAnswer);
        // Calculating the correct answer
        System.out.println("The correct answer is: " + (n1 / n2));     


    }

}