package method;

public class StaticAndNonstatic {

    public static void main(String[] args) { // static method
        StaticAndNonstatic s = new StaticAndNonstatic();
        s.task(); // non-static need create obj
        Job(); // static  no need to create obj
    }

    public static void Job(){
        System.out.println("I am static method");
    }

    public void task(){
        // non static method
        System.out.println("I am non static method");
    }

}
