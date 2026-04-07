    //Encapsulation binding data and method together into a single entity

    //private variable can be accesed only within the class so we use getters and setters to set values and use them 


class Student
{
    private String name;
    private int age;

    //setting values for name
    public void setname(String name)
    {
        this.name = name;
    }

    //getting(printing name for the user) values for the user
    public String getname()
    {
        return name;
    }

    //setting age for the age variable
    public void setage(int age)
    {
        this.age = age;
    }

    //getting(printing) age for the user
    public int getage()
    {
        return age;
    }
}
public class EncapsulationPractice 
{
    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.setname("Subish");
        obj.setage(19);
        System.out.println("Your name is "+obj.getname()+" and your age is "+obj.getage());
    }
}
