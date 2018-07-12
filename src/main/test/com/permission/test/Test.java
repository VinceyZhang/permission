package com.permission.test;

/**
 * Created by ok_vince on 2018-06-09.
 */
public class Test {

    public static void main(String args[]) {

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));

        System.out.print("test():"+test());
    }

    public static Integer test() {

        try {
            System.out.print("try()");
            return 100;
        } catch (Exception e) {
            System.out.print("catch()");
            return 3;
        } finally {
            System.out.print("finally()");
            return 10;
        }
    }
}
