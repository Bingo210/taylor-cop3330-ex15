/*
 * UCF COP3330 Fall 2021 Assignment 15 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        int flag = 0;

        while (flag == 0) {
            System.out.println("What is the password?");
            String userGuess = input.nextLine();

            if (userGuess.equals("abc$123")) {
                System.out.println("Welcome!");
                flag = 1;
            }
            else
                System.out.println("I don't know you.");
        }
    }
}
