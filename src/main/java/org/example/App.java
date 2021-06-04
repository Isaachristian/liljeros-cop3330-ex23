/*
 *  UCF COP3330 Summer 2021 Assignment 23 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package org.example;

import java.util.Locale;
import java.util.Scanner;

/**
 * Troubleshooting Car Issues
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Car Help!\n" +
                "Answer the following questions with y (yes) or n (no)");
        System.out.print("Is the car silent when you turn the key? ");
        if (scanner.nextLine().toLowerCase(Locale.ROOT).equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            if (scanner.nextLine().toLowerCase(Locale.ROOT).equals("y")) {
                System.out.println("Clean terminals and try starting again.");
            } else {
                System.out.println("Replace cables and try again.");
            }
        } else {
            System.out.print("Does the car make a slicking noise? ");
            if (scanner.nextLine().toLowerCase(Locale.ROOT).equals("y")) {
                System.out.println("Replace car battery.");
            } else {
                System.out.print("Does the car crank up but fail to start? ");
                if (scanner.nextLine().toLowerCase(Locale.ROOT).equals("y")) {
                    System.out.println("Check spark plug connections.");
                } else {
                    System.out.print("Does the engine start and then die? ");
                    if (scanner.nextLine().toLowerCase(Locale.ROOT).equals("y")) {
                        System.out.print("Does you car have fuel injection? ");
                        if (scanner.nextLine().toLowerCase(Locale.ROOT).equals("y")) {
                            System.out.println("Get it in for service.");
                        } else {
                            System.out.println("Check to ensure the choke is open");
                        }
                    } else {
                        System.out.println("This should not be possible");
                    }
                }
            }
        }

    }
}
