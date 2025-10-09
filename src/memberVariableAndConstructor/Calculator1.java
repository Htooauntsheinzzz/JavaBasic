package memberVariableAndConstructor;

public class Calculator1 {

    //member variable / global variable  / instance variable
    int value1;
    int value2;
    int value3;

    //  create constructor
    public Calculator1(int x , int y){
        value1 = x;
        value2 = y;
    }

    // Constructor overload
    public Calculator1(int value1, int value2,int value3 ){
        // this  keyword <- for class member  variable
        // member (Class)  =  con value1
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }


    void add(){
        int result = value1 + value2;
        System.out.println("Add value is "+result);
    }
    void subtract(){
        int result = value1 - value2;
        System.out.println("Subtract value is "+result);
    }

    void  multiply(){
        int result = value1 * value2;
        System.out.println("Multiply value is "+result);
    }

    void divided(){
        int result = value1 / value2;
        System.out.println("Divided value is "+result);
    }

    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1(10,2);
        c1.add();
        c1.subtract();
        c1.multiply();
        c1.divided();


        Calculator1 c2 = new Calculator1(10,2,3);
        c2.add();
        c2.subtract();
        c2.multiply();
        c2.divided();
    }


}
