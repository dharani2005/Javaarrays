package org.example;

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
}



