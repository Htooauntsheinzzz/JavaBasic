package operators;

public class ExerciseThree {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
// 10 +  (0-1)   -> 10 - 1 = 9

        a += --b;  // prefix
// 10 + 0 -> 10+0  = 10
        a += b --;  // postfix
        // b -1 = 0-1 =-1

        boolean single = true;
        // ! not
        // single not true  => false
        boolean result = !single;

        System.out.println(result);

//        System.out.println(a);
//
//
//        System.out.println(b);

    }
}
