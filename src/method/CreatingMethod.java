package method;

import org.w3c.dom.ls.LSOutput;

/**
 * Creating Method
 * 1.method name
 * 2.return type (void or no void )
 * 3.access modifiers (public , private, protected , default )
 * 4.parameter (value)
 * 5.method body { }
 *
 *
 *
 * Rule
 *
 * start with small latter and using CamelCase
 */
public class CreatingMethod {


    public static void main(String[] args) {
        // Class Name obj var    new ()
        CreatingMethod cm = new CreatingMethod();
        System.out.println(cm.jobName());
        cm.task(3);
    }

    // Creating method with void no return value
      public void task(int i){
          System.out.println("Do website for CRM" + i);
      }
      // Creating method without void  and with return value its datatype
      public String jobName(){
        String job = "Software Developer";
        return job;
      }

}
