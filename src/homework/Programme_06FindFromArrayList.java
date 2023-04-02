package homework;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_06FindFromArrayList {
    ArrayList list = new ArrayList();
    public static void main(String[] args) {
        Programme_06FindFromArrayList obj = new Programme_06FindFromArrayList();
        ArrayList list = obj.list;
        obj.addElements();
        obj.findElements(3,list);
    }
    public void addElements(){
        list.add("Java");
        list.add("Advance Java");
        list.add("Selenium");
        list.add("Spring");
        list.add("Strut");
        list.add("Android");
        list.add("Cloud Computing");
    }
    public void findElements(int i,ArrayList list){
        System.out.println(list.get(i));
    }
}
