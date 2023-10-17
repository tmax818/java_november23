package prep.day01.Strings;

public class Main {
    public static void main(String[] args) {
        
        byte[] mybytes = {67, 89, 110, 65, 68};

        String mystring = new String(mybytes); // 0100 0011

        System.out.println(mystring);
        System.out.println(Integer.toBinaryString(67));
        System.out.printf("%c\n", 65);

        // for(int i = 0; i < 300; ++i){
        //     System.out.printf("%d = %c and binary is %s\n",i, i, Integer.toBinaryString(i));
        // }

    }
}
