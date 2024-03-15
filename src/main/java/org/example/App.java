package org.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] newNames = {"sree dharani", "sree reddy", "Avyukth reddy", "sree dharani"};
        NameRepository.setNames(newNames);
        System.out.println("Size of names array: " + NameRepository.getSize());
        System.out.println("\nAll names:");
        String[] allNames = NameRepository.findAll();
        for (String name : allNames) {
            System.out.println(name);
        }
        String foundname = NameRepository.find("Avyukth reddy");
        if (foundname != null) {
            System.out.println("\nFound name: " + foundname);
        } else {
            System.out.println("\nName not found.");
        }
        boolean addednewname = NameRepository.add("rama mohan reddy");
        System.out.println("new name is added  " + addednewname);
        System.out.println("Size of names array: " + NameRepository.getSize());
        String[] matchedNames = NameRepository.findByFirstName("sree");
        System.out.println("name found with firstname  " + Arrays.toString(matchedNames));
        String[] lastnamematched = NameRepository.findByLastName("reddy");
        System.out.println("name found with lastname  " + Arrays.toString(lastnamematched));
        boolean nameupdate = NameRepository.update("sree dharani", "sree reddy");
        System.out.println("updated name is  " + nameupdate);
        boolean result = NameRepository.remove("sree reddy");
        System.out.println("removed the name :  " + result);
        System.out.println("Size of names array: " + NameRepository.getSize());
        NameRepository.clear();
        System.out.println("\nSize of names array after clearing: " + NameRepository.getSize());
    }
}





