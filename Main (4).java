// Programmers: Shane, Jorge
// Course:  CS212, Professor Nweke
// Due Date: 2/04/2024
// Lab: 2
// Problem Statement: Your task is to write a Java program for the Quick Play function from the lottery vending machine.
// Data In: The players name and Amount to play
// Data Out: Good luck message, prize amount, lottery numbers/tickets and closing message
// Credits: none


import java.util.Scanner;
import java.util.Random; 
import java.text.DecimalFormat;

public class Main
{
	public static void main(String[] args) {
	    // Intalize onjects 
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.00");
	
	// Welcome message	
	System.out.print("This program generates 10 lottery tickets. \n");
	
	// Prompt for player's name
	System.out.print("What is your name? ");
	String name = scan.next();	
	
	
	    // Prompt for the amount to play
        System.out.print("How much do you want to play? ");
        double amount = scan.nextDouble();
        System.out.println("Great! " + name + " wants to play $" + df.format(amount) + ".\n");

        // Display lottery tickets
        System.out.println("Here are the tickets:");
        System.out.println("-----------------");

        // Lotto Winning Numbers
        int[] winningNumbers = {3, 5, 16, 58, 59, 11};

        double prize = 0.0;
        
        // Generate and display 10 lottery tickets
        for (int i = 0; i < 10; i++) {
            int[] lotteryNumbers = new int[6];

            // Generate 6 random numbers for each ticket
            for (int j = 0; j < 6; j++) {
                lotteryNumbers[j] = rand.nextInt(100);

                // Display formated lottery numbers
                if (lotteryNumbers[j] < 10) {
                    System.out.print("0" + lotteryNumbers[j] + " ");
                } else {
                    System.out.print(lotteryNumbers[j] + " ");
                }
            }
            System.out.println();

            // Check for matching numbers with the winning numbers
            for (int num : lotteryNumbers) {
                for (int winNum : winningNumbers) {
                    if (num == winNum) {
                        // Increase the amount to the powere of 1.75 if there is a match
                        amount = Math.pow(amount, 1.75);
                        break;
                    }
                }
            }
        }
        
        // Display separator
        System.out.println("-----------------");
        
        // Display goodluck message
        System.out.println("Good luck " + name + "!");
        System.out.println("-----------------");

        // Calculate and print prize money
        prize = Math.round(amount * 100.0) / 100.0;
        System.out.println("Your Winnings are :\n$" + df.format(prize));
        System.out.println("-----------------");

    }
}