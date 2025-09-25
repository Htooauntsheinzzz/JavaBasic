package controlflow;
/*
do while looping
 */
public class ExerciseEight {

    public static void main(String[] args) {
//        initial point
//        do{
//            process
//               initial point de / in
//        }while(expression); condition check end point  last
//
        int i = 0; // initial point

        do{
            System.out.println("This is do only one time ");
            System.out.println("Number is "+i);// process
            i++; // increase
        }while(i < 1); // end point


        // start point      process     in / de         end point

        // 0            {nuberis 0 }   0 ++ = 1             1 < 100 true
        // 1            {number is 1    1++ = 2             2 < 100 true
        //98                98          98++ = 99           99 < 100 true
        // 99               number is 99   99++ = 100       100 < 100 false  loop stop

        // 0                {0 }             0 +1 = 1        1<0 false

    }
}
