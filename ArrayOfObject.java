class Student
{
    String name;
    int age;
    int marks;
}
public class ArrayOfObject 
{
    public static void main(String[] args)
    {
        //Student 1 details
        Student s1 = new Student();
        s1.name = "Subish";
        s1.age = 19;
        s1.marks = 100;

        //Student 2 details
        Student s2 = new Student();
        s2.name = "Ravi";
        s2.age = 20;
        s2.marks = 100;

        //Student 3 details
        Student s3 = new Student();
        s3.name = "varun";
        s3.age = 19;
        s3.marks = 90;

        Student array[] = new Student[3];
        array[0] = s1;
        array[1] = s2;
        array[2] = s3;

        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i].name +" " +array[i].age + " "+array[i].marks);
        }
    }
}
