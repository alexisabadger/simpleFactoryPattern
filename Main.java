package com.badger.factorypatterntesting;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Credit Service!");
        System.out.println("Your choices are: 1 for Experian, 2 for TransUnion, and 3 for Equifax: ");

        // get user input (from validation class)
        int serviceChoice = ValidateInput.getValidInput();

        // get credit service object from factory
        CreditService yourCreditService = CreditServiceFactory.getCreditScore(serviceChoice);
        
        System.out.println(yourCreditService.toString());
    }
}
