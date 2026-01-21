package needresources;

import java.util.Scanner;

public class ScannerExercise {


    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String fileName = scanner.nextLine();
        System.out.println("Enter Your Location");
        String location = scanner.nextLine();
        System.out.println(fileName);
        System.out.println(location);

    }
}
