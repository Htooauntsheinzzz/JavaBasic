package method;

public class ReturnMethod {

    public static void main(String[] args) {
        ReturnMethod rm = new ReturnMethod();
        int result = rm.totalScore(); // accept
        System.out.println(result);
    }


    // return method // no void
    public int  totalScore(){
        int scoreOne = 2;// statement 1
        int scoreTwo = 4;// statement 2
        int totalScore = scoreOne + scoreTwo; // statement 3
        return totalScore; // return value // datatype
    }
}
