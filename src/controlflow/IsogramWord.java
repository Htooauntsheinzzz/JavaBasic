package controlflow;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class IsogramWord {

    public static void main(String[] args) throws Exception {
        IsogramWord iso = new IsogramWord();
        if(iso.outPutProgram()){
            System.out.println("It is Isogram");
        }else{
            System.out.println("It is not");
        }
    }

    public boolean outPutProgram() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your English Vocabulary");
        String word = reader.readLine();
        String lowerWord = word.toLowerCase();
        Set<Character> charSet = new HashSet<>(); // collection framwork -> charSet -> obj

        for (int i = 0; i < lowerWord.length(); i++) {
            char c = lowerWord.charAt(i);

            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }
        return true;
    }
}

/**
 * apple -> Lower Word
 *                      4
 *for( i = 0 ; i < lowerOW rd.le{
 *     char c = lowerword.charAt(i)  ->  lowerword.charAt(0)
 *}
 *
 */




