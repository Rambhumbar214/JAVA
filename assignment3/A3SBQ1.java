package assignment3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class A3SBQ1 {
    public static void main(String[] args) {
      
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");

        System.out.println("Colors using Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

       
        System.out.println("\n\nColors in reverse using ListIterator:");
        ListIterator<String> listIterator = colors.listIterator(colors.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }

       
        LinkedList<String> newColors = new LinkedList<>();
        newColors.add("pink");
        newColors.add("green");

     
        int index = colors.indexOf("yellow");
        colors.addAll(index, newColors);

        
        System.out.println("\n\nFinal list after inserting pink and green:");
        for (String color : colors) {
            System.out.print(color + " ");
        }
    }
}
