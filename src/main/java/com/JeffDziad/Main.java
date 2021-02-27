package com.JeffDziad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = keyboard.nextLine();

        System.out.print("Enter your middle initial: ");
        String middleInitial = keyboard.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = keyboard.nextLine();

        System.out.print("Enter your birth year: ");
        int birthYear = Integer.parseInt(keyboard.nextLine());

        System.out.print("Enter your birth month: ");
        int birthMonth = Integer.parseInt(keyboard.nextLine());

        System.out.print("Enter your birth day: ");
        int birthDay = Integer.parseInt(keyboard.nextLine());

        System.out.print("Enter your gender (M or F): ");
        String genderCodeString = keyboard.nextLine();
        char genderCode = genderCodeString.charAt(0);

        try{
            DriversLicense driversLicense = new DriversLicense();
            driversLicense.setOverflow(0);
            driversLicense.setSoundexCode(new LastNameUtility().encodeLastName(lastName));
            driversLicense.setFirstNameMiddleInitial(new FirstNameUtility().encodeFirstName(firstName, middleInitial));
            driversLicense.setBirthYear(birthYear);
            driversLicense.setBirthMonthDayGender(new MonthDayGenderUtility().encodeMonthDayGender(birthYear, birthMonth, birthDay, genderCode));
            String floridaDriversLicense = new FloridaFormatter().formatLicenseNumber(driversLicense);
            String wisconsinDriversLicense = new WisconsinFormatter().formatLicenseNumber(driversLicense);
            System.out.printf("Florida: %s%nWisconsin: %s", floridaDriversLicense, wisconsinDriversLicense);
        } catch (MissingNameException | UnknownGenderCodeException | InvalidBirthdayException e) {
            e.printStackTrace();
        }



    }

}
