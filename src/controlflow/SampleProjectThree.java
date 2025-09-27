package controlflow;

import javax.swing.*;

public class SampleProjectThree {

    public static void main(String[] args) {
        String username = null;
        String password = null;

        String [] [] students = {
                {
                    "mgmg@gmail.com","12345"
                },
                {
                    "soesoe@gmail.com","12345"
                },
                {
                    "linlin@gmail.com","12345"
                }
        };

        boolean running = true;

        while (running){
            //first i
            if (username == null){
                String inputUsername = JOptionPane.showInputDialog("Please Enter Your Username");
                //second if
                if(inputUsername.contentEquals("Admin")){
                    username =inputUsername;
                }
            }else{
                String inputPassword = JOptionPane.showInputDialog("Please Enter Your Password");
                // second if
                if(inputPassword.contentEquals("12345")){
                    password = inputPassword;
                    if(username.equals("Admin" )&& password.equals("12345")){
                        JOptionPane.showMessageDialog(null,"Login Successful");
                    }else{
                        JOptionPane.showMessageDialog(null,"Login Fail");
                    }
                    running = false;
                }
            }
        }
    }
}
