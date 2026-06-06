import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Comparator_p 
{
    public static void main(String[] args) 
    {
        Comparator<Integer> obj = new Comparator<Integer>()         //(Comparator)interface needs to be implemented
        {
        public int compare(Integer i, Integer j)
            {
                if(i % 10 > j % 10)
                {
                    return 1;       //return 1 means swap
                }
                else
                    return -1;      //return -1 means no swap
            }
        };
        List<Integer> nums = new ArrayList<>();
        nums.add(51);
        nums.add(33);
        nums.add(92);
        nums.add(75);
        //Collections.sort(nums)        //sorts the List in ascending order
        Collections.sort(nums,obj);     //by passing comparator object we can write our own implementation

        System.out.println(nums);
    }
}
@Override
public int compare(Object o1, Object o2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'compare'");
}
