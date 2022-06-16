package com.badger.factorypatterntesting;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // create a scanner
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to Credit Service!");
        System.out.println("Please enter 1 for Experian, 2 for TransUnion, and 3 for Equifax: ");

        // get input from user
        int serviceChoice = Integer.parseInt(myScanner.nextLine());

        CreditService yourCreditService = CreditServiceFactory.getCreditScore(serviceChoice);

        System.out.println(yourCreditService.toString());
    }
}
