package method;

/*
1. static => non-static (Dont call Direct)
 */
public class CallStaticAndNonStatic {

    public static void main(String[] args) {
     theEnd();
    }
    // static method (static to non-static) (Cannot Call Direct Non-Static Method)
    public static  void task(){
        CallStaticAndNonStatic c = new CallStaticAndNonStatic();
        c.heyNow();
    }

    // Non Static
    public void heyNow(){

    }
    // static to static (Call Direct)
    public static void theEnd(){

    }
    //non-static to static (Call Direct)
    public void hello(){
        task();
        theEnd();
    }


}
