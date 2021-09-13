package org.example;

import java.time.Year;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App 
{
    public static void main( String[] args )
    {
        //Objective is to calculate the year and age someone will retire
        Scanner scan = new Scanner(System.in);
        String inputAge;
        long curAge, retAge, diff;
        System.out.print("What is your current age?: ");
        curAge = scan.nextLong();
        System.out.print("What age do you want to retire?: ");
        retAge = scan.nextLong();
        diff = retAge - curAge;
        Year curYear = Year.now(); //gets the current year
        Year retYear = Year.now().plusYears(diff); //adds the amount of years needed to retire
        System.out.print("You have " +diff +" years until you retire.\nIts " +curYear +" so you can retire in " +retYear);
    }
}
