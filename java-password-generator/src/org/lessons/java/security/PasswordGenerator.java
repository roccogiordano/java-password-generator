package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        // Variables Declaration

        String FirstName;
        String LastName;
        String FavouriteColor;
        Integer DayOfBirth;
        Integer MonthOfBirth;
        Integer YearOfBirth;
        Integer SumOfBirth;

        //


        // User Input

        Scanner Input = new Scanner(System.in);

        System.out.println("Type your first name...");
        FirstName = Input.nextLine();

        System.out.println("Type your last name...");
        LastName = Input.nextLine();

        System.out.println("Type your favourite color...");
        FavouriteColor = Input.nextLine();

        System.out.println("Type your date of birth (dd/mm/yyyy)...");
        DayOfBirth = Input.nextInt();
        MonthOfBirth = Input.nextInt();
        YearOfBirth = Input.nextInt();

        SumOfBirth = DayOfBirth + MonthOfBirth + YearOfBirth;

        Input.close();

        //
    }
}
