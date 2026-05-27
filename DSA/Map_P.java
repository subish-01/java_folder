package DSA;

import java.util.HashMap;
import java.util.Map;

public class Map_P 
{
    public static void main(String[] args) 
    {
        Map<String,Integer> Students = new HashMap<>();
        Students.put("Subish", 98);
        Students.put("Hari", 87);
        Students.put("Madhavan", 92);
        Students.put("Vishal", 76);
        Students.put("Ravi", 89);
        Students.put("Subish",100);

        System.out.println(Students);               //every key is unique but the values are not unique
                                                    //key - Set mathri(unique), values - List mathri unique ah irukathu

        System.out.println(Students.get("Subish"));
        System.out.println(Students.get("Madhavan"));       //get() - input key output value

        System.out.println(Students.keySet());          //prints all keys in hashmap

        for(String key : Students.keySet())
        {
            System.out.println(key + " : " + Students.get(key));
        }
    }
}
