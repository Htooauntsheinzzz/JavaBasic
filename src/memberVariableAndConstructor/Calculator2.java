package memberVariableAndConstructor;

public class Calculator2 {

            // local variable create
    void  add (int value1 , int value2 ){
        int result = value1 + value2;
        System.out.println(result);
    }

    void subtract(int value1 , int value2){
        int result = value1 - value2;
        System.out.println(result);
    }

    void multiply(int value1 , int value2){
        int result = value1* value2;
        System.out.println(result);
    }

    void divided(int value1, int value2) {
        int result = value1 / value2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Calculator2 c2 = new Calculator2();
        c2.add(10,2);
        c2.subtract(10,2);
        c2.multiply(10,2);
        c2.divided(10,2);
    }

}
