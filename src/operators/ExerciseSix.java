package operators;

/*

Ternery Operators

 con ? result 1 : result 2;
 con true result 1
 con false result 2

 */
public class ExerciseSix {

    public static void main(String[] args) {
        int x = 20;
                    //  condition ? result 1   : result2
        String answer = x != 20 ? "Good to Go" : "Dont Go";

        System.out.println(answer);
    }
}
