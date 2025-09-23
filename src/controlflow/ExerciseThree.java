package controlflow;

public class ExerciseThree {

    public static void main(String[] args) {
        int examResult = 80;

        if(examResult >= 0 && examResult <=41){
            System.out.println("You are fail");
        }else if (examResult>=41 && examResult <=79){   // 41 and 79
            System.out.println("You are merit");
        }else {
            System.out.println("You are distinction");
        }
    }
}
