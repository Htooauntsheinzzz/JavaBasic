package arrays;
// two dimension array
public class MultiArrayExerciseOne {

    public static void main(String[] args) {
        // multi dimension arrary [] []
        String[] person = {}; // single arrary

        // multi
        String [] []  people ={
                {"Mg Mg","Su Su"}, // -> row -> 0
                {"Aung Aung","Kyaw Kyaw"}, // row 1
                {"Ko Ko","Oo Oo", "Daw Daw"} // row 2
        };
        /*
        mg mg -> row 0,0
        Aung Aung -> row 1,0
        Daw Daw -> row 2,2
         */
        System.out.println(people[0][0]);
        System.out.println(people[1][1]);
        System.out.println(people[2][2]);

    }
}
