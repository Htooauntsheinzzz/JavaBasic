package controlflow;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExerciseFour {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Salary");
        int salary = Integer.parseInt(reader.readLine());// String -> Integer type covertion

        if(salary >=80000){
            System.out.println("Your salary is high");
        } else if (salary>=50000) {
            System.out.println("Your salary is middle");
        }else {
            System.out.println("Your salary is low");
        }

    }
    /*
    Enter Your salary
    input -> 65000

    condtion
    1st condition -> 65000 >= 80000  false skip
     */
}
