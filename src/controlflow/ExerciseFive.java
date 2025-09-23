package controlflow;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/***
 * Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
 **/
public class ExerciseFive {

    public static void main(String[] args) throws  Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter First floating decimal Point Number");
        double firstNumber = Double.parseDouble(reader.readLine());
        System.out.println("Enter Second floating decimal Point Number");
        double secondNumber =Double.parseDouble(reader.readLine());

        firstNumber= Math.round(firstNumber*1000); // 456567
        double resultOne = firstNumber/1000;

        secondNumber = Math.round(secondNumber*1000); // 456568
        double resultTwo = secondNumber/1000;

        if(resultOne == resultTwo){
            System.out.println("Same numbers");
        }else {
            System.out.println("Numbers are different");
        }

    }
}
