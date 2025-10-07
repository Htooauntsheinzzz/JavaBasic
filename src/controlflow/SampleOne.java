package controlflow;

public class SampleOne {

    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,0};

        int result = 0;
        for(int i= 0; i < arr.length; i++){
         result = result*2+ arr[i];
        }
        System.out.println(result);
    }
}

// 11010


