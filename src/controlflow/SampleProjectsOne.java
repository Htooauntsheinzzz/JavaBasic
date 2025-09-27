package controlflow;

import javax.swing.*;

public class SampleProjectsOne {

    public static void main(String[] args) {

        String[] names = new String[10];

        // 10 for loop
        for (int i = 0 ; i < 10 ; i++){
            names[i] = JOptionPane.showInputDialog("Add Your Names !");
        }
        // For each
//        for(String name : names){
//            System.out.println("Person is "+name);
//        }
        int i = 0;

        while(i < names.length){
            System.out.println("Person is "+names[i]);
            i++;
        }

        /*
            int i = 0 , i < name.length  {} i++
            i =0 ,      0 <  10   person  , 1
            1           1< 10  person , 2
         */


    }
}
