package homework;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_04ArrayList {
    ArrayList<String> list = new ArrayList<>();
    public void addElements(){
        list.add("White");
        list.add("Blue");
        list.add("Black");
        list.add("Pink");
        list.add("Yellow");
        list.add("Red");
        for(String s : list){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        Programme_04ArrayList obj = new Programme_04ArrayList();
        obj.addElements();
    }
}
