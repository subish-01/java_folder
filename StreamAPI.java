import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamAPI 
{
    public static void main(String[] args)
    {
        List<Integer> nums = Arrays.asList(2,8,13,3,1,7);
        //StreamAPI

        Stream<Integer> s1 = nums.stream();

        //printing values using for each method

        //s1.forEach(i -> System.out.println(i));   //once stream is used it cannot be used again

        //using filter to filter the values

        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        //s2.forEach(i -> System.out.println(i));

        //using map
        Stream<Integer> s3 = s2.map(i -> i * 2);
        s3.forEach(j -> System.out.println(j));


        //another way of implementing stream
        int result = nums.stream()
                    .filter(i -> (i & 1) != 1)     //filtering values based on condition
                    .map(j -> j * 1)                //applying map on filter
                    .reduce(0,(c,e) -> c+e);    //reduce gives one value so it is stored in a variable
                
        System.out.println(result);
    }
}
