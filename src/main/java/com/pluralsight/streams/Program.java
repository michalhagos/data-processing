package com.pluralsight.streams;

import com.pluralsight.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

// use a stream to search for people by name
// filter will help us keep only the people whose first or last name matches
// collect turns the stream back into a list
        List<Person> matchingPeople = people.stream()
                .filter(person -> person.getFirstName().toLowerCase().contains(searchName)
                        || person.getLastName().toLowerCase().contains(searchName))
                .collect(Collectors.toList());

// display the matching people
        System.out.println("Search Results for: " + searchName );
        if (matchingPeople.isEmpty()) {
            System.out.println("No people found with that name.");
        } else {
            for (Person person : matchingPeople) {
                System.out.println(person);
            }
            System.out.println("Found " + matchingPeople.size() + " results");
        }



        int totalAge = people.stream()
                // map() transforms each person object into just their age number
                .map(Person::getAge)

                // Integer::sum is a method reference that adds two numbers together
                .reduce(0, Integer::sum);

// divide total by number of people to get the average
        double averageAge = (double) totalAge / people.size();
        System.out.printf("Average age of all people: %.1f%n", averageAge);

// sorted() sorts the stream by age
        Person oldestPerson = people.stream()
                .max(Comparator.comparingInt(Person::getAge))
                .orElse(null);

        System.out.println("Oldest person: " + oldestPerson);

// sorted() sorts the stream by age
// Comparator.comparingInt uses method reference to compare by age

        Person youngestPerson = people.stream().
                min(Comparator.comparingInt(Person::getAge))
                .orElse(null);

        System.out.println("Youngest person: " + youngestPerson);


    }


}
