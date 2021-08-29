import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    
    public static String checkGuess(int guess) {
        Random rand = new Random(); // instance of random class
        int num = rand.nextInt(10) + 1; // generates random values between 1 - 10
        if (guess < num){
            return "Too low.";
        } else if (guess > num){
            return "Too high.";
        } else {
            return "You win!!";
        }
    }


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a number between 1 and 10");
        int x = scan.nextInt();

        System.out.println(checkGuess(x));

        scan.close();

    }
}
