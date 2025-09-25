package controlflow;

public class ExerciseNine {


    void StepOne(){
        System.out.println("This is step one");
    }

    void StepTwo(){
        System.out.println("This is step two");
    }

    public static void main(String[] args) {
//        Array  A
//        for(Type variablename  : Array A) {
//            variablename -> execute
//        }
//        Obj A
//        for(ObjA objvaiable : Obj A){
//            objvaiable ->execute
//        }

        String [] names ={"Mg Mg","Mya Mya","Ko Ko","Tun Tun","Lin Lin","Soe Soe","Moe Moe"};
    //       type variable  Array
        for (String people : names){
            System.out.println(people); // variable
        }
    }
}
