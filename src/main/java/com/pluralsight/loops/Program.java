package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
// create a list of 10 people to search through
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
        System.out.println("Enter a name to search (first or last): ");
        String searchName = scanner.nextLine().trim().toLowerCase();

// create a new Array list to hold the people that match the search with a name matching list
        List<Person> matchingPeople = new ArrayList<>();

// loop through every person in the list using for each
        for (Person person : people) {

            // check if the first name or last name matches the search
            //  using toLowerCase so the search is not case-sensitive
            boolean firstNameMatches = person.getFirstName().toLowerCase().contains(searchName);
            boolean lastNameMatches = person.getLastName().toLowerCase().contains(searchName);

            // if either name matches add this person to the results means if one of them true
            if (firstNameMatches || lastNameMatches) {
                matchingPeople.add(person);
            }
        }

// displaying the matching people
        System.out.println("\n Search Results for: " + searchName );

// check if we found anyone with the searched names
        if (matchingPeople.size() == 0) {
            System.out.println("No people found with that name.");
        } else {
            // looping through the matching people and print each one
            for (Person person : matchingPeople) {
                System.out.println(person);
            }
            System.out.println("Found " + matchingPeople.size() + " results");
        }

// calculate the average age of all people in the original list
// first adding up all the ages using  a for loop
        double totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }

// then divide by the number of people to get the average
        double averageAge = totalAge / people.size();
        System.out.printf("Average age of all people: %.1f", averageAge);



    }







}
