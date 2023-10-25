package prep.day01.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        byte[] mybytes = {67, 89, 110, 65, 68};

        String mystring = new String(mybytes); // 0100 0011
        char star = '*';

        // System.out.println(mystring);
        System.out.println(Integer.toBinaryString(star));
        System.out.println(Integer.toBinaryString(42));
        // System.out.printf("%c\n", 65);

        // for(int i = 0; i < 300; ++i){
        //     System.out.printf("%d = %c and binary is %s\n",i, i, Integer.toBinaryString(i));
        // }

        ArrayList<Character> letters = new ArrayList<>();
        char[] oletters = new char[27];
        int j = 0;
        for(int i = 97; i < 123; i++){
            char ch = (char)i;
            System.out.println(ch);
            oletters[j] = ch;
            j++;

        }

        System.out.println(Arrays.toString(oletters));


    }
}
