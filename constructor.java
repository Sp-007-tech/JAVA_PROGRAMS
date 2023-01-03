// Non-parameterised constructor ==>>which has no argument..(2)It is invoked at the time of obj creation. If we dont create one then it is created by java.

class Student{
    String name;
    int age;

    Student(){
        System.out.println("Constuctor called");
    }
}


// parameterized constructor ==>> which has parameter...(1) It is used to provide different values to distinct obj..

class Stud{
    String name;
    int age;

Stud( String name,int age){
    this.name = name;
    this.age = age;
}
}

// copy constructor ==>>(1) a copy constructor is an overloaded constructor used to declare and intialize an object from another obj..(2) There are only user definde CC in java..

class Stu{
    String name;
    int age;

    Stu(Stu s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}
