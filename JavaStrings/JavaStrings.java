package JavaStrings;

import java.util.Arrays;

public class JavaStrings {
    public static void main(String[] args){
        String A = "hello";
        String B = "java";

        int joinedLen = 0;
        String precedes = "";

        A = A.substring(0,1).toUpperCase() + A.substring(1);
        B = B.substring(0,1).toUpperCase() + B.substring(1);
        joinedLen = (A+B).length();

        String[] words = new String [] {A,B};
        Arrays.sort(words);

        if(words[0] == A)
        {
            precedes = "No";
        }
        else
        {
            precedes = "Yes";
        }

        System.out.println(joinedLen);
        System.out.println(precedes);
        System.out.println(A + " " + B);
    }
}
