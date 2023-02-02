public class RelationalOperators {
    public static void main(String[] args) throws Exception {
        //variable declaration
        int i = 10;
        int i1 = 20;
        float f = 4.5f;
        float f1 = 3.5f;
        double d = 59.6d;
        char c = 'x';
        char c1 = 'y';
        String s = "So-And-So";
        String s1 = "So-And-So";
        String s2 = "so-And-so";
        boolean b = true;
        boolean b1 = false;

        long l = 1996L;
        long l1 = 2023L;
        byte y = 1;
        short h = 25;

        //comparing integers
        System.out.println("i == i1: " + (i == i1));
        System.out.println("i != i1: " + (i != i1));
        System.out.println("i > i1: " + (i > i1));
        System.out.println("i <= i1: " + (i <= i1));

        //float comparison
        System.out.println("f == f1: " + (f == f1));
        System.out.println("f != f1: " + (f != f1));
        System.out.println("f >= f1: " + (f >= f1));
        System.out.println("f < f1: " + (f < f1));

        //comparing chars
        System.out.println("c == c1: " + (c == c1));
        System.out.println("c != c1: " + (c != c1));
        System.out.println("c > c1: " + (c > c1));
        System.out.println("c <= c1: " + (c <= c1));

        //comparing strings
        System.out.println("s == s1: " + (s == s1));
        System.out.println("s == s2: " + (s == s2));
        System.out.println("s != s1: " + (s != s1));
        //System.out.println(s >= s1); //compilation error
        //System.out.println(s < s1); //compilation error

        //boolean comparison
        System.out.println("b == b1: " + (b == b1));
        System.out.println("b != b1: " + (b != b1));
        //System.out.println(b > b1); //compilation error
        //System.out.println(b <= b1); //compilation error

        //integer-float comparison
        System.out.println("i1 > f1: " + (i1 > f1));

        //double-short comparison
        System.out.println("d == h: " + (d == h));

        //string-char comparison
        //System.out.println(s1 != c); //compilation error

        //string-integer comparison
        //System.out.println(s2 != i); //compilation error

        //long-integer comparison
        System.out.println("l == i1: " + (l == i1));
        System.out.println("l1 >= i: " + (l1 >= i));

        //byte-short comparison
        System.out.println("y != h: " + (y != h));
    }
}
