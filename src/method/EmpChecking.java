package method;

public class EmpChecking {

    public static void main(String[] args) {
        checkingEmp();// static method
        EmpChecking obj = new EmpChecking();
        obj.kpiChecking();// instance method
        obj.SalaryChecking();  // instance method

    }

    // Emp Number Checking method

    public static void checkingEmp(){
        System.out.println("I am checking emp");
        // statements
    }

    public void SalaryChecking(){
        System.out.println("I am salary checking");
    }

    public void kpiChecking(){
        System.out.println("I am kpi checking");
    }
}
