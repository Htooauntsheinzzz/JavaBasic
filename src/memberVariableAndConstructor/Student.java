package memberVariableAndConstructor;

public class Student {

    String name;
    int age;
    String major;

    public Student(String name, int age , String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // copy constructor
    public Student(Student s){
        this.name = s.name;
        this.age =s.age;
        this.major = s.major;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(major);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aung Aung",20,"Computer Science");

        Student s2 = new Student (s1);
        s2.display();

    }


}
