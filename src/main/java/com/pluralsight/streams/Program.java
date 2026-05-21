package com.pluralsight.streams;

import com.pluralsight.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // create the same list of people as in the loops exercise
        List<Person> people = new ArrayList<>();
        people.add(new Person("Marcus", "Bennett", 34));
        people.add(new Person("Sofia", "Ramirez", 28));
        people.add(new Person("Aiden", "Nakamura", 45));
        people.add(new Person("Layla", "Hassan", 22));
        people.add(new Person("Nadia", "Okafor", 31));
        people.add(new Person("Carlos", "Petrov", 19));
        people.add(new Person("Priya", "Sharma", 52));
        people.add(new Person("Jordan", "Bennett", 27));
        people.add(new Person("Elena", "Torres", 38));
        people.add(new Person("Oliver", "Chen", 41));

// ask the user for a name to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search (first or last): ");
        String searchName = scanner.nextLine().trim().toLowerCase();


    }


}
