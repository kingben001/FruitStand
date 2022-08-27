package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String choice;

        do {
            System.out.println("What would you like to purchase?" +
                    " apples, bananas, or mangoes");
            choice = keyboard.next();


            if ((!choice.equals("apples") && (!choice.equals("bananas")) && (!choice.equals("mangoes")))) {
                System.out.println("We dont sell those here!");

        }

            }while (!choice.equalsIgnoreCase("apples") && !choice.equalsIgnoreCase("bananas") && !choice.equalsIgnoreCase("mangoes"));

        if(choice.equalsIgnoreCase("apples")) {
            System.out.println("How many apples would you like to buy?");
            int numofFruit = keyboard.nextInt();
            double total = numofFruit * .30;
            System.out.println("Your total is $" + total);
        }

        else if(choice.equalsIgnoreCase("bananas")) {
            System.out.println("How many bananas would you like to buy?");
           int numofFruit = keyboard.nextInt();
            double total = numofFruit * .40;
            System.out.println("Your total is $" + total);
        }

        else if(choice.equalsIgnoreCase("mangoes")) {
            System.out.println("How many mangoes would you like to buy?");
            int numofFruit = keyboard.nextInt();
            double total = numofFruit * .50;
            System.out.println("Your total is $" + total);
        }
//        else {
//            System.out.println("We dont sell those here!");
//
//        }

     //   while (choice.equalsIgnoreCase("apples") || choice.equalsIgnoreCase("bananas") || choice.equalsIgnoreCase("mangoes"));
        System.out.println("Thank you come again");
    }
}



