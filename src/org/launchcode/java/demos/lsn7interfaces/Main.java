package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
//        Comparator comparator = new FlavorComparator();
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
//        flavors.sort(comparator);
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        flavors.sort(new FlavorComparator());
        System.out.println("\nFlavors");
        for (int i = 0; i < flavors.size(); i++)
            System.out.println(flavors.get(i));

        cones.sort(new ConeComparator());
        System.out.println("\nCones");
        for (int i = 0; i < cones.size(); i++)
            System.out.println(cones.get(i));
    }
}

// resource I found useful for figuring out how to print after using comparator to sort the arrayList https://www.geeksforgeeks.org/comparator-interface-java/