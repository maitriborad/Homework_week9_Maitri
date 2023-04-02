package homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_09HashMap {
    Map<String,Integer> map = new HashMap<>();
    public void addElement(){
        map.put("Maitri",1);
        map.put("Shreya",2);
        map.put("Nikunja",3);
        map.put("Sandip",4);
        map.put("Rashmita",5);
        map.put("Arusa",6);
        map.put("Nirmal",7);
        map.put("Paryank",8);
        for (Map.Entry<String,Integer> map:map.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
    public static void main(String[] args) {
        Programme_09HashMap obj = new Programme_09HashMap();
        obj.addElement();
    }
}
