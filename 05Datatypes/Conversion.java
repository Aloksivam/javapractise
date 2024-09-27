public class Conversion{
    public static void main(String[] args) {
        // long nr = 33;
        // int n = (int)nr; //doing type conversion
        // System.out.println(n);

        // char c = 'a';
        // int asci = c;
        // System.out.println(c);

        // byte a = 5;
        // byte b = (byte)(a*2);// 2 is considered as integer, so it will not do conversion .. you can do by explicitly typecasting into (byte)
        // System.out.println(b);

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i  = 1000;
        float f = 3.14f;
        double d = 99.9954;
        System.out.println((f*b)+(i%c)-(d*s));
        // System.out.println((int)c);

    }
    
}