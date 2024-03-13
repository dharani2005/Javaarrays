package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {


        String[] newNames = {"sree dharani", "sreehan reddy", "Avyukth reddy"};
        NameRepository.setNames(newNames);
        System.out.println("Size of names array: " + NameRepository.getSize());
        System.out.println("\nAll names:");
        String[] allNames = NameRepository.findAll();
        for (String name : allNames)
        {
            System.out.println(name);
        }
        NameRepository.clear();
        System.out.println("\nSize of names array after clearing: " + NameRepository.getSize());
    }
}