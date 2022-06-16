package com.badger.factorypatterntesting;

import java.util.Scanner;

// class to validate user input
public class ValidateInput {

    // validate user input
    public static int getValidInput() {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Please enter 1, 2, or 3: ");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number, please try again: ");
                sc.next();
            }
            number = sc.nextInt();

            if (number > 3 || number < 1) {
                System.out.println("That number is not valid, please try again: ");
            }
        } while (number <= 0 || number > 3);
        // System.out.println("Thank you! Got " + number);

        return number;
    }

}
