package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner in = new Scanner(System.in);
        System.out.println("You are in a land full of dragons. In front of you, you see two caves.");
        System.out.println("In one cave, the dragon is friendly and will share his treasure with you.");
        System.out.println("The other dragon is greedy and hungry and will eat you on sight.");

        int cave;

            System.out.print("Which cave will you go into? (1 or 2) ");

            cave = in.nextInt();

        if (cave == 1) {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky..");
            System.out.println("A large dragon jumps out in front of you! He opens his jaw and...");
            System.out.println("Gobbles you down in one bite!...");
        }

        else if (cave == 2) {
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky..");
            System.out.println("A large dragon jumps out in front of you! Starts to dance...");
            System.out.println("And shares his treasure with you!...");
        }

        else {
            System.out.println("Number is invalid. Please choose cave 1 or 2.");
        }
    }
}
