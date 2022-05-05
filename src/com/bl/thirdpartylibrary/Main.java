package com.bl.thirdpartylibrary;

import java.util.Scanner;

public class Main {
    public static String userInput() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }

    public static void main(String[] args) {
        PersonDetails firstPerson = new PersonDetails();
        System.out.println("Please Enter the First Name :");
        firstPerson.setFirstName(userInput());
        System.out.println("Please Enter Last Name : ");
        firstPerson.setLastName(userInput());
        System.out.println("Please Enter Address : ");
        firstPerson.setAddress(userInput());
        System.out.println("Please Enter City : ");
        firstPerson.setCity(userInput());
        System.out.println("Please Enter State : ");
        firstPerson.setState(userInput());
        System.out.println("Please Enter Zip Code : ");
        firstPerson.setZipCode(userInput());
        System.out.println("Please Enter Phone Number : ");
        firstPerson.setPhoneNumber(userInput());
        System.out.println("Please Enter Email : ");
        firstPerson.setEmail(userInput());
        System.out.println(firstPerson);

        PersonDetails secondPerson = new PersonDetails();
        System.out.println("Enter the Second Person Details");
        System.out.println("Please Enter the First Name :");
        secondPerson.setFirstName(userInput());
        System.out.println("Please Enter Last Name : ");
        secondPerson.setLastName(userInput());
        System.out.println("Please Enter Address : ");
        secondPerson.setAddress(userInput());
        System.out.println("Please Enter City : ");
        secondPerson.setCity(userInput());
        System.out.println("Please Enter State : ");
        secondPerson.setState(userInput());
        System.out.println("Please Enter Zip Code : ");
        secondPerson.setZipCode(userInput());
        System.out.println("Please Enter Phone Number : ");
        secondPerson.setPhoneNumber(userInput());
        System.out.println("Please Enter Email : ");
        secondPerson.setEmail(userInput());
        System.out.println(secondPerson);
    }
}
