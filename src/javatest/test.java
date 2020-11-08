package javatest;

import java.util.HashMap;

/**
 * @author xuxiaopeng
 * @date 2020/3/26 10000:26 下午
 * @className: test
 * @description:
 */
public class test {
    public static void main(String[] args) {

        Integer a = 1000;
        Integer b = 1000;
        Integer c = new Integer(1000);
        Integer d = new Integer(1000);
        int e = 1000;


        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(a == c);
        System.out.println(a.equals(c));

        System.out.println(c == d);
        System.out.println(c.equals(d));

        System.out.println();

        System.out.println(e == a);
        System.out.println(c == e);
        System.out.println(a.equals(e));
        System.out.println(c.equals(e));

        HashMap hashMap = new HashMap<String, Object>();

        hashMap.put(null, "123");
        hashMap.put(null, "321");

        System.out.println(hashMap.get(null));


//        Integer a = new Integer(1000);
//        Integer b = 1000;
//        int c = 1000;
//        Integer d=1000;
//        System.out.println("a == b:"+(a == b));
//        System.out.println("a == c:"+(a == c));
//        System.out.println("b == c:"+(b == c));
//        System.out.println("b == d:"+(b == d));

    }
}
