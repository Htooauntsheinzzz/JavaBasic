package method;

import java.security.cert.CertPathBuilderResult;

public class ParameterOrArgument {

    public static void main(String[] args) {
        ParameterOrArgument pa = new ParameterOrArgument();
        pa.getName("Htoo Aunt"); //
        pa.getAge(24);
        pa.getJobTitle("Software Developer",1,"Team Lead");
        int salary = pa.getSalaryTotal(50000);
        System.out.println("Salary Total: " + salary);
    }

                        // Refer Parameter
    public void getName(String name){ // instance method
        System.out.println("Name is "+name);
    }

    public void getAge(int age){
        System.out.println("Age is "+age);
    }
    // instance method
    public void getJobTitle(String jobTitle,int empNumber,String jobRole){
        System.out.println("JobTitle is "+jobTitle);
        System.out.println("EmpNumber is "+empNumber);
        System.out.println("JobRole is "+jobRole);
    }

    // return method
    public int getSalaryTotal(int salary){
        int result = salary * 12;
        return result;
    }
}
