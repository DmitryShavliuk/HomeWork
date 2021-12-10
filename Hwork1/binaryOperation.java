package Hwork1;

public class binaryOperation {
    public static void main(String[] args) {
    int a = 42;
    int b = 15;
    int c = a & b;
    int d = a | b;
    int y = a ^ b;
    int z = ~b;
    int i = ~a;
    System.out.println(+c);
    System.out.println(+d);
    System.out.println(+y);
    System.out.println(+z);
    System.out.println(+i);
    a <<= 2;
    System.out.println(+a);
    b <<= 2;
    System.out.println(+b);
    a >>= 2;
    System.out.println(+a);
    b >>= 2;
    System.out.println(+b);
    a = a >>> 1;
    System.out.println(+a);
    b = b >>> 1;
    System.out.println(+b);
}
}
