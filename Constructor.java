class Student
{
    String name;
    int age;

    Student(String name,int age)
    {
        this.name = name;           //parameterized constructor to initialize the values
        this.age = age;
    }
    Student()
    {
        this.name = "null";
        this.age = 0;                  //default constructor created to initialize the values
    }
}

public class Constructor 
{
    public static void main(String[] args)
    {
        Student obj1 = new Student("Subish",20);
        Student obj2 = new Student();
        System.out.println("Name is "+obj1.name + " and the age is " +obj1.age);  
        System.out.println("name is "+obj2.name +" and the age is "+ obj2.age);
    }
}
