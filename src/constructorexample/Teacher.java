package constructorexample;

public class Teacher {
    String name;
    String role;
    String subject;

    public Teacher(String name, String role, String subject){
        this.name = name;
        this.role = role;
        this.subject = subject;
    }

    void display(){
        System.out.println(role);
        System.out.println(subject);
    }

}
