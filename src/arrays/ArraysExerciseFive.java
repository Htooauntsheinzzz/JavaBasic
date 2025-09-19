package arrays;

import java.util.Arrays;

public class ArraysExerciseFive {

    public static void main(String[] args) {
        String[] cars ={"BMW","Mercedes","Supra","Mitsubishi","Land Curiser","Honda"};

//        String[] copyCars = new String[5];
//
//        System.arraycopy(cars,1, copyCars, 1, 4);
//
//        System.out.println(Arrays.toString(copyCars));


        // direct copy -> Arrays.copyOfRange (original arrarys , start of index,end of index + 1)


        String[] copyCars = Arrays.copyOfRange(cars,0,3);
        System.out.println(Arrays.toString(copyCars));
    }
}
/*
copy - null,Merce
 */