package prep.day01.DataTypes;

public class Main {

    public static void main(String[] args) {

        boolean bo = true;
        Boolean bow = true;
        byte by = 127;
        Byte byw = 127;
        short s = 1234;
        Short sw = 1234;
        int i = 23452345;
        Integer iw = 23452345;
        long l = 123412341L;
        Long lw = 123412341L;
        float f = 3.14f;
        Float fw = 3.14f;
        double d = 6.02e23;
        Double dw = 6.02e23;

        char c = 'A';

        System.out.println(c);

        System.out.print(Character.toChars(c));

        System.out.println(Integer.toBinaryString(c));





        System.out.printf("Size of boolean in bits: %d\n", 1);
        System.out.printf("Size of byte in bits: %d\n", Byte.SIZE);
        System.out.printf("Size of short in bits: %d\n", Short.SIZE);
        System.out.printf("Size of int in bits: %d\n", Integer.SIZE);
        System.out.printf("Size of long in bits: %d\n", Long.SIZE);
        System.out.printf("Size of float in bits: %d\n", Float.SIZE);
        System.out.printf("Size of double in bits: %d\n", Double.SIZE);


    }
    
}
