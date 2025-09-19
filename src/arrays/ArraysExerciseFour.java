package arrays;

import java.util.Arrays;
// arrary must be execute using copy method
public class ArraysExerciseFour {

    public static void main(String[] args) {

        int[] numbers ={1,2,3,4,5,6}; // original Array

        int[] copyNumbers = new int [6]; // determine copy array for original
        //                  numbers ,       index 0           ,            copyNumbers ,  0,
//        System.arraycopy(name of original array,start position to original index,name of copy array, start of copy arrary position, length of arrary to copy )
        System.arraycopy(numbers,0, copyNumbers, 0, 6);//System.arraycopy

        System.out.println(Arrays.toString(copyNumbers));// Arrays.toString
    }
}
