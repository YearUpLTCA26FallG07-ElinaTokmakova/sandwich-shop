package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
       double regularBasePrice = 5.45;
       double largeBasePrice = 8.95;
        // student 17 or younger = 10% discount
        // seniors 65 or older = 20% discount
        // else no discount
       double studentDiscount = 0.1;
       double seniorDiscount = 0.2;
       double price;
       double total;

       Scanner scanner = new Scanner(System.in);
       System.out.print("Select sandwich size (regular or large): ");
       String sandwichSize = scanner.nextLine();

       if (sandwichSize == "regular") {
           price = regularBasePrice;
       } else {
           price = largeBasePrice;
       }
       System.out.println("The " + sandwichSize + " price is " + price);

       System.out.print("How old are you? ");
       int age = scanner.nextInt();

       if (age <= 17) {
           total = price - price * studentDiscount; // System.out.println("Double up to 2 decimal places: "+String.format("%.2f",d))
           System.out.println ("You get 10% student discount. The total is $" + String.format("%.2f", total));
       } else if (age >= 65) {
            total = price - price * seniorDiscount;
            System.out.println ("You get 20% senior discount. The total is $" + String.format("%.2f", total));
       } else {
           total = price;
           System.out.println ("The total is $" + total);
       }
    }
}