public class StrBuffer 
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Subish");
        System.out.println(sb.charAt(1));
        System.out.println(sb.substring(1,5));
        System.out.println(sb.deleteCharAt(3));
        System.out.println(sb);
    }
}
