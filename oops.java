class Student{
    String name;
    int age;

    public void getInfo(){
        System.out.println("The name of this student is " + this.name);
        System.out.println("The age of the student is " + this.age);
    }
}
public class oops{
    static public void main(String args[]){
        Student s1 = new Student();
        s1.name = "sp";
        s1.age = 21;
        s1.getInfo();

        Student s2 = new Student();
        s2.name = "DJ";
        s2.age = 28;
        s2.getInfo();
    }
}