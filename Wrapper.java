public class Wrapper 
{
    public static void main(String[] args)
    {
        //autoboxing
        int num = 14;   //primitive datatype
        Integer num1;   //object/reference type
        num1 = num;     //primitive to object type (Autoboxing)
        System.out.println(num1);   

        //autounboxing
        Integer num2 = 19;  //object/reference type
        int num3;           //primitive datatype
        num3 = num2;        //object to primitive(autounboxing)
        System.out.println(num3);


        // converting String to integer using object type's method

        String str = "64";
        int number = Integer.parseInt(str);
        System.out.println(number);
    }
}
