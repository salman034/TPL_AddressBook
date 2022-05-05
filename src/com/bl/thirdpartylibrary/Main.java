package com.bl.thirdpartylibrary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    static Hashtable<Integer, ArrayList<PersonDetails>> hashTable = new Hashtable<>();
    static int choice;
    static AddDetails addPersonDetail = new AddDetails();

    public static int choice() {
        // Print the value to choice.
        System.out.println(" 0. Exit. ");
        System.out.println(" 1. Add contact. ");
        System.out.println(" 2. Edit contact. ");
        System.out.println(" 3. Delete contact. ");
        choice = scanner.nextInt();
        return choice;
    }

    private static int inputInteger() {
        int integerInput = scanner.nextInt();
        return integerInput;
    }

    public static void main(String[] args) throws IOException {
        // Use HashTable to add Multiple AddressBook in Dictionary.
        System.out.println("Enter The Number of add Multiple AddressBook");
        int numberOfAddressBook = inputInteger();
        for (int i = 1; i <= numberOfAddressBook; i++) {
            System.out.println("AddressBook " + i);
            ArrayList<PersonDetails> contact = new ArrayList<>();
            // We use while loop
            choice = choice();
            while (choice != 0) {
                AddDetails addPersonDetail = new AddDetails();
                System.out.println("Would you like to add someone else? 1: Yes, 2: No");
                choice = scanner.nextInt();
                if (choice > 1)
                    choice = choice();
                // Used to switch case to easily add details, edit details and delete details.
                switch (choice) {

                    case 1:
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
                        boolean addNewEntry = addPersonDetail.duplicateDetailsRemove(contact,firstName);
                        System.out.println(contact);
                        System.out.println("The value is " + " " + addNewEntry);
                        if (!addNewEntry)
                            contact.add(personDetail);
                        else
                            System.out.println("Finally Duplicate Entry Remove");
                        break;

                    case 2:
                        System.out.println("Enter First Name of contact that you would like to edit: ");
                        addPersonDetail.editContact(contact);
                        break;

                    case 3:
                        addPersonDetail.deleteContact(contact);
                        break;

                    default:
                        System.out.println("Complete Process update Contact Details");
                        break;

                }
            }
            hashTable.put(i, contact);
        }

        for (int i = 1; i <= hashTable.size(); i++) {
            System.out.println("address book " + i);
            System.out.println(hashTable.get(i));
        }
            System.out.println("Goodbye!");
            System.out.println();
    }
}
