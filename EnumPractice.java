enum practice
{
    Running,pending,success;
}
public class EnumPractice 
{
    public static void main(String[] args)
    {
        practice obj = practice.Running;
        System.out.println(obj);

        System.out.println(obj.ordinal());

        practice[] p = practice.values();
        for(practice i : p)
        {
            System.out.println(i);
        }
    }
}
