// Programmers: Shane, Jorge
// Course:  CS212, Professor Nweke
// Due Date: 2/04/2024
// Lab: 2
// Problem Statement: Your task is to write a Java program for the Quick Play function from the lottery vending machine.
// Data In: The players name
// Data Out: Lottery ticket with the numbers and estimated jackpot
// Credits: none

import java.util.Scanner;
import java.util.Random; 

public class Main
{
	public static void main(String[] args) {
	    // Intalize variables 
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
	System.out.print("This program generates 10 lottery tickets. \n");
	// Prompt for player's name
	System.out.print("What is your name? ");
	String name = scan.next();	
	int count = 0;
		System.out.print("Here is your ticket: \n");
		
	// Generate lottery ticket Numbers and Print lottery ticket 
	while (count < 10){
	    int rand_int1 = rand.nextInt(100);
        int rand_int2 = rand.nextInt(100);
        int rand_int3 = rand.nextInt(100);
        int rand_int4 = rand.nextInt(100);
        int rand_int5 = rand.nextInt(100);
        int rand_int6 = rand.nextInt(100);
        if (rand_int1 < 10){
            System.out.print("0" + rand_int1 + " ");

        }
        else{
            System.out.print(rand_int1 + " ");

        }
        if (rand_int2 < 10){
            System.out.print("0" + rand_int2 + " ");

        }
        else{
            System.out.print(rand_int2 + " ");

        }
        if (rand_int3 < 10){
            System.out.print("0" + rand_int3 + " ");

        }
        else{
            System.out.print(rand_int3 + " ");

        }
        if (rand_int4 < 10){
            System.out.print("0" + rand_int4 + " ");

        }
        else{
            System.out.print(rand_int4 + " ");

        }
        if (rand_int5 < 10){
            System.out.print("0" + rand_int5 + " ");

        }
        else{
            System.out.print(rand_int5 + " ");

        }
        if (rand_int6 < 10){
            System.out.print("0" + rand_int6 + "\n");

        }
        else{
            System.out.print(rand_int6 + "\n");

        }

        count = count + 1;
	}
	// Print lottery ticket 
	System.out.print("---------------------- \n");
	
	// Print good luck message
	System.out.print("Good luck " + name + "! \n");
	System.out.print("Estimated Jackpot: \n ");
	
	// Print estimated Jackpot
    System.out.print("$225,938,745 \n");
	System.out.print("---------------------- \n");

       
	}
}
