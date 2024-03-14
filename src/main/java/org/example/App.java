package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] newNames = {"sree dharani", "sreehan reddy", "Avyukth reddy"};
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


        NameRepository.clear();
        System.out.println("\nSize of names array after clearing: " + NameRepository.getSize());
    }
}





