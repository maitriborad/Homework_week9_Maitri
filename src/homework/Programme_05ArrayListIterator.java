package homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterator.
 */
public class Programme_05ArrayListIterator {
    ArrayList <Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Programme_05ArrayListIterator obj = new Programme_05ArrayListIterator();
        obj.addElements();
    }
    public void addElements(){
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(5);
        list.add(55);
        list.add(22);
        Iterator i = list.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}