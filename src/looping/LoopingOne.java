package looping;

public class LoopingOne {

    public static void main(String[] args) {

        int rows = 10;

        for (int i = 0 ; i < rows;i++){ // row  1
            for(int j=0;j < i ; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//i = 0 ,  0 < 10 ,  i = 1
//j = 0 , 0 < 1 , j = 1 -> *
//j 1 , 1 < 1    break
//
//1  1 < 10          2
//0 , 0 < 2  j =1 *
//1 , 1 < 2  j =2 *  j 2
//2 , 2 < 2  break
//
//2 , 2 < 10  // 3
//0 , 0 < 3  j= 1 *
//1 , 1 < 3  j = 2 *
//2 , 2 < 3 j = 3 *

