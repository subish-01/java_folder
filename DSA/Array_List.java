package DSA;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
public class Array_List 
{
    public static void main(String[] args)
    {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(5);
        nums.add(7);
        nums.add(3);
        nums.add(9);
        System.out.println(nums); 
        System.out.println(nums.get(2));



        // If you want to add and fetch elements Collection<integer> nums = new ArrayList<Integer> is useful
        // but if you work with index values List<Integer> nums = new ArrayList<Integer> makes sense
    }
}
