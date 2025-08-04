package com.mycompany.learnscanner;

import java.util.Scanner;

public class LearnScanner {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i;
        double d;
        String name;
        
        System.out.print("What is your name?: ");
        name = sc.nextLine();
        System.out.println("Hello, " + name);
        
        System.out.print("Enter an int number: ");
        i = sc.nextInt();
        System.out.println("You entered: " + i);
        
        System.out.print("Enter a double number: ");
        d = sc.nextDouble();
        System.out.println("You entered: " + d);
        
        sc.close();
        
        //test Git - this is a comment
        
    }
}
