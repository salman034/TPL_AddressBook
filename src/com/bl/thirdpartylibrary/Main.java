package com.bl.thirdpartylibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // we create an object from the ArrayList named contact.
    static ArrayList<PersonDetails> contact = new ArrayList<PersonDetails>();
    public static Scanner scanner = new Scanner(System.in);
    static int menu;

    public static int choice() {
        // Print the value to choice.
        System.out.println(" 0. Exit. ");
        System.out.println(" 1. Add contact. ");
        System.out.println(" 2. Edit contact. ");
        System.out.println(" 3. Delete contact. ");
        menu = scanner.nextInt();
        return menu;
    }

    public static void main(String[] args) {
        // we create an object from the AddDetails class named addPersonDetail.
        AddDetails addPersonDetail = new AddDetails();
        // we use while loop
        menu = choice();
        while (menu != 0) {
            if (menu > 1)
                menu = choice();
            //use to switch case to easily add details and edit details.
            switch (menu) {
                case 1:
                    while (menu != 2) {

                        System.out.println("Enter First Name: ");
                        String firstName = scanner.next();
                        System.out.println("Enter Last Name: ");
                        String lastName = scanner.next();
                        System.out.println("Enter Address: ");
                        String address = scanner.next();
                        System.out.println("Enter City: ");
                        String city = scanner.next();
                        System.out.println("Enter State: ");
                        String state = scanner.next();
                        System.out.println("Enter a zipCode: ");
                        String zipCode = scanner.next();
                        System.out.println("Enter PhoneNumber: ");
                        String phoneNumber = scanner.next();
                        System.out.println("Enter email: ");
                        String email = scanner.next();
                        PersonDetails personDetail = new PersonDetails(firstName, lastName, address, city, state, zipCode,
                                phoneNumber, email);
                        contact.add(personDetail);
                        System.out.println("Would you like to add someone else? 1: Yes, 2: No");
                        menu = scanner.nextInt();
                    }
                    break;

                case 2:
                    System.out.println("Enter First Name of contact that you would like to edit: ");
                    // Character input
                    addPersonDetail.editContact(contact);
                    break;

                default:
                    System.out.println("Please choose a valid contact details");
                    break;
            }
            //for loop use to print the data after add aur edit.
            for (int i = 0; i < contact.size(); i++)
                System.out.println(contact.get(i));
            {
                System.out.println("Goodbye!");
                System.out.println();
            }
        }
    }
}
