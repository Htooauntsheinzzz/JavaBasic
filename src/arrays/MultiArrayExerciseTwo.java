package arrays;
// three dimension array
public class MultiArrayExerciseTwo {

    public static void main(String[] args) {
        String [][][] names = { // arrary 1
                { //array 2 of 1
                        {"Aung Aung","Mg Mg","Kyaw Kyaw"},
                        {"Moe Moe","Su Su","Lin Lin"}
                },
                { //array 2 of 2
                        {"Zaw Zaw","Khin Khin"},
                        {"Soe Soe","Ko Ko"}
                },
                { //array 2 of 3
                        {"Pa Pa","Phoo Phoo"},
                        {"Zin Zin","Aye Aye"}
                }
        };

        //
        System.out.println(names[0][0][0]);
        System.out.println(names[2][0][1]);

    }
}
