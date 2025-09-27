package method;

public class AboutReturn {

    public static void main(String[] args) {
        System.out.println(task());
        AboutReturn a = new AboutReturn();

        if(a.valueBoolean()){
            System.out.println("It is true");
        }else {
            System.out.println("It is false");
        }

    }

    public static int task(){
        return 10;
    }
        // non
    public boolean valueBoolean(){
        return false;
    }
}
