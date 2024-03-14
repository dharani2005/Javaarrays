package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class NameRepository {
    private static String[] names = new String[0];

    public static int getSize() {
        return names.length;
    }

    public static void setNames(String[] newNames) {
        names = Arrays.copyOf(newNames, newNames.length);
    }

    public static void clear() {
        names = new String[0];
    }

    public static String[] findAll() {
        return Arrays.copyOf(names, names.length);
    }

    /* finding the fullname*/
    public static String find(final String fullname) {
        for (String element : names) {
            if (element.equalsIgnoreCase(fullname)) {
                return element;

            }
        }
        return null;
    }

    public static boolean add(final String fullname) {
        String foundfullname = find(fullname);
        if (foundfullname != null) {
            return false;
        }
        String[] newNames = Arrays.copyOf(names, names.length + 1);
        newNames[newNames.length - 1] = fullname;
        names = newNames;
        return true;
    }

    public static String[] findByFirstName(final String firstname) {
        String result = "";
        for (String name : names) {
            if (name.split(" ")[0].equalsIgnoreCase(firstname)) {
                result = result + name + ",";

            }
        }
        System.out.println(result);
        return result.split(",");


        }




    public static String[] findByLastName(final String lastname) {
        String result = "";
        for (String name : names) {
            if (name.split(" ")[1].equalsIgnoreCase(lastname)) {
                result = result + name + ",";

            }
        }
        return result.split(",");


    }

    public static boolean update(final String original, final String updatedname) {
        for (String element : names) {
            if (element.equalsIgnoreCase(original)) {
                String updated = element.replace(original, updatedname);
                return true;
            }
        }
        return false;
    }


}





