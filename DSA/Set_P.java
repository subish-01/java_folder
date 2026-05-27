package DSA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;     
public class Set_P 
{
    public static void main(String[] args) 
    {
        Set<Integer> nums = new HashSet<Integer>();    //Hashset is an unordered collection of unique elements
        nums.add(3);
        nums.add(7);
        nums.add(2);
        nums.add(18);
        nums.add(3);

        for(int n : nums)
        {
            System.out.print(n + " ");
        }


        System.out.println();

        Set<Integer> nums2 = new TreeSet<Integer>();    //TreeSet is an ordered collection of unique elements
        nums2.add(3);
        nums2.add(7);
        nums2.add(2);
        nums2.add(18);
        nums2.add(3);

        for(int i : nums2)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        //printing values using Iterator
        Iterator<Integer> values = nums2.iterator();

        while(values.hasNext())
            System.out.println(values.next());         //checks whether it has next element or not
            
    }

}
