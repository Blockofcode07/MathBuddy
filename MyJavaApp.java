import java.util.Scanner;

/*  Instead of writing long, repetitive blocks of boilerplate code in the main method, 
we can use user-defined methods to make our code cleaner, easier to read, and more maintainable. 
By creating reusable methods, we reduce duplication, minimize the chance of errors, 
and improve the overall structure of our program.  */

public class MyJavaApp {

    // This method prints a formatted math question to the console
    public static void printQuestion(int num1, String op, int num2) {
        String question = "What is " + num1 + op + num2 + "? ";
        System.out.print(question);
    }

    // This method displays the user's answer and the correct answer
    public static void answerFeedback(int userAnswer, int correctAnswer) {
        System.out.println("Your answer is: " + userAnswer);
        System.out.println("The correct answer is: " + correctAnswer);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1 = 6;
        int n2 = 7;

        printQuestion(n1,"+",n2);
        int userAnswer = scan.nextInt();
        int correctAnswer = n1 + n2;   
        answerFeedback(userAnswer, correctAnswer);    
        
        printQuestion(n1,"-",n2);
        userAnswer = scan.nextInt();
        correctAnswer = n1 - n2;   
        answerFeedback(userAnswer, correctAnswer);    

        printQuestion(n1,"*",n2);
        userAnswer = scan.nextInt();
        correctAnswer = n1 * n2;   
        answerFeedback(userAnswer, correctAnswer);  

        printQuestion(n1,"/",n2);
        userAnswer = scan.nextInt();
        correctAnswer = (int)(n1 / n2);   
        answerFeedback(userAnswer, correctAnswer);   

    }

}