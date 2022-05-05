package com.bl.thirdpartylibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<PersonDetails> contact = new ArrayList<PersonDetails>();
    public static Scanner scanner = new Scanner(System.in);
    static int menu;

    public static int choice() {
        System.out.println(" 0. Exit. ");
        System.out.println(" 1. Add contact. ");
        System.out.println(" 2. Edit contact. ");
        System.out.println(" 3. Delete contact. ");
        menu = scanner.nextInt();
        return menu;
    }

    public static void main(String[] args) {
        AddDetails addPersonDetail = new AddDetails();
        menu = choice();
        while (menu != 0) {
            if (menu > 1)
                menu = choice();
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
                    addPersonDetail.editContact(contact);
                    break;

                case 3:
                    addPersonDetail.deleteContact(contact);
                    break;

                default:
                    System.out.println("Please choose a valid contact details");
                    break;
            }
            for (int i = 0; i < contact.size(); i++)
                System.out.println(contact.get(i));
            {
                System.out.println("Goodbye!");
                System.out.println();
            }
        }
    }
}
