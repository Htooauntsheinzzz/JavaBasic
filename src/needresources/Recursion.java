package needresources;


public class Recursion {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();

        System.out.println(recursion.calculate(5));

    }

    public int calculate(int num){
        System.out.println(num);
        if(num == 1){
            return 1;
        }
        return calculate(num -1 )*num;
    }
}
