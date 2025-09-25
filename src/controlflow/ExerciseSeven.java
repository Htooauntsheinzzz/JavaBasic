package controlflow;

/*
While Loop
 */
public class ExerciseSeven {

    public static void main(String[] args) {
//        initial point;
//        //    (end point) //. first
//        while(expression){
//            process
//            initial point (Decre/ Increse
//        }

        int i = 0 ; // initial Point
            //end point
        while( i < 100){
            System.out.println("Number is "+i); // process
            i++; // initial point increase
        }
        // start point      end point            proess               in / de
        //  0               0 < 100 true        {Number is  0}         i++ -> 0 ++ = 1
        // 1  = i               1 < 100             work                 2
        // 2                    2 < 100             work                 3
        //99                    99 < 100            work                99 + 1 = 100
        // 100                  100 < 100 false    -> stop loop
    }
}
