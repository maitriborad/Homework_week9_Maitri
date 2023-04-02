package homework;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class Programme_07ArrayEmpty {
    ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
         Programme_07ArrayEmpty obj = new Programme_07ArrayEmpty();
         ArrayList list = obj.list;
         obj.addElements();
         obj.isEmpty(list);
    }
    public void addElements() {
        list.add("White");
        list.add("Blue");
        list.add("Black");
        list.add("Pink");
        list.add("Yellow");
        list.add("Red");
    }
    public void isEmpty(ArrayList list){
        System.out.println(list);
        System.out.println("Array list is Empty or not: " + list.isEmpty());
        list.removeAll(list);
        System.out.println(list);
        System.out.println("Array list is Empty or not: " + list.isEmpty());
    }
}
