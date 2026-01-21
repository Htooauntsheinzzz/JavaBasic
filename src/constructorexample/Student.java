package constructorexample;

public class Student {

    String name;
    String age ;
    String major;
    Teacher teacher;// obj
                                                        // obj
    public  Student(String name,String age,String major,Teacher teacher){
        this.name = name;
        this.age = age;
        this.major = major;
        this.teacher = teacher;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(major);
        System.out.println(teacher.name);
        System.out.println(teacher.role);
        System.out.println(teacher.subject);
    }

    public static void main(String[] args) {
         Teacher teacher1 = new Teacher("U Mg Mg","Lecture","CSC472");
                                                                                            // obj
         Student student1 = new Student("Kyaw Kyaw","20", "Computer Science", teacher1);
         student1.display();
         System.out.println("Display From Teacher");
         teacher1.display();// when obj create from teacher class it can call every method and member variable

    }


}
