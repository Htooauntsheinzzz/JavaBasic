package operators;
/*
Logical Operators
&& , || , ! (not)
 */
public class ExerciseFive {

    public static void main(String[] args) {

        int age = 20;
        int limit  = 18;
        //               condition 1 and condition 2
        // && -> THE WHOLE   two condition must be true
//        boolean result = age == 20 && limit > age;
        // OR 1 condition is true result is always true;

        boolean result =  limit != age  &&   age == 20 ;


        System.out.println("This is Result :"+result);

    }
}
