package needresources;

public class StaticFinal {

    static String name ;
    static String major;
    static{
        name = "Mg Mg";
        major ="Computer Sciences";
    }
    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(major);
    }
}

class InnerClass extends StaticFinal{

    public static void main(String[] args) {
        name ="Aye Aye";
        System.out.println(name);
        System.out.println(major);
    }

}

