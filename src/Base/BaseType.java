package Base;

public class BaseType {

    public static void main(String[] args) {
        //Symbol type
        char symbolC = 97; // a

        //bool type
        boolean bool = false; // false = 0, true = 1

        //number type
        byte b = 100; // 1 byte -128 => 127 + 1 => -128 + 128 =0 + 128 = -128
        short s = 100;// 2 byte -32356 => 32355
        int i = 10_000; // 4 byte -4_000_002 => 4_000_000 40000000000
        long l = 1_000_000_0; // 8 byte - 4_000_000_000 => 4_000_000_000

        float f = 10.5f; // 4 byte -4_000_002.e6 => 4_000_000
        double d = 100.123123123123123d;// 8 byte - 4_000_000_000.e10 => 4_000_000_000

        String word1 = "First string";
        String word2 = "result: " + (b+s) + " next result: "+  (100/5); // 200

        // + - * / % ()
        System.out.println(word2);
//        System.out.println(b);
//        System.out.println(s);
//        System.out.println(i);
//        System.out.println(l);
//        System.out.println(f);
//        System.out.println(d);

//        System.out.println(c + 1);
//        System.out.println(b + s);
//        System.out.println(i + l);
//        System.out.println(f + i);
//        System.out.println(l + f);
//        System.out.println(d + l);

    }

}
