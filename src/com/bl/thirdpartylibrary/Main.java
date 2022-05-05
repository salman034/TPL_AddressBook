package com.bl.thirdpartylibrary;

public class Main {
    public static void main(String[] args) {
        PersonDetails person = new PersonDetails();
        person.firstName("Salman");
        person.lastName("Pasha");
        person.Address("BTM 1st Stage");
        person.City("Bangalore");
        person.State("Karnataka");
        person.ZipCode(560029);
        person.PhoneNumber("9845715264");
        person.Email("mks@gmail.com");
        System.out.println(person.toString());
    }
}
