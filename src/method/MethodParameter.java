package method;

public class MethodParameter {

    public static void main(String[] args) {

        MethodParameter m  = new MethodParameter();
        m.add(1,2);
        System.out.println(m.subtract(2,1));
        m.getInfo("Mg Mg");

    }
                        // paramter
    public void add(int a , int b){
        int result = a + b;
        System.out.println("Add value is "+ result);
    }
                        //paramter
    public int subtract(int a, int b){
//        int result  = a -b;
//        return result;
        return  a - b;
    }

    public void getInfo(String name){
        System.out.println(name);
    }
}
