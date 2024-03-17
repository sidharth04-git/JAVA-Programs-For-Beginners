package OperatorsInJava;

public class BitwiseOperator {
    public static void main(String[] args) {
        int p = 9 , q = 10;
        System.out.println(p|q);  // Bitwise OR
        System.out.println(p&q);  // Bitwise AND
        System.out.println(p^q);  // Bitwise X-OR
        System.out.println(p<<1); // Bitwise Left Shift
        System.out.println(p<<2); // Bitwise Left Shift
        System.out.println(q>>1); //Bitwise Right Shift
        System.out.println(q>>2); // Bitwise Right Shift

    }
}
