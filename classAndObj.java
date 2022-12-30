// class is user defined data type which define its properties and functions..
class Student
{
    String name;
    int age;
    
    public void getInfo()
    {
        System.out.println("The name of the student is " + this.name);
        // "this" keyword is used to refer the current instance of the class...
        System.out.println("The age of the student is " + this.age);
    }
}

public class classAndObj
    
{
    static public void main(String args[])
    {
        
        // Obj is a runtime entity.It is an instance of the class.
        // When Obj is created using the new keyword, then space is allocated for var. in heap...
        Student s1 = new Student();
        s1.name ="SP";
        s1.age = 20;
        s1.getInfo();

        System.out.println();

        Student s2 = new Student();
        s2.name = "SM";
        s2.age = 19;
        s2.getInfo();
        
    }
}
