public class PrimativeType {
    public static void main(String[] args) {
        final double PI=3.1415926;
        byte b=0x55;
        short s=0400;
        int i=100000;
        long l=0xffffffffl;
        char c='A';
        float f=.25f;
        double d=.00001234;
        boolean bool =true;
        System.out.printf("final Pi=%f\n",PI);
        System.out.printf("byte b= %d\n",b);
        System.out.printf("short s=%d\n",s);
        System.out.printf("long l=%d\n",l);
        System.out.printf("char c=%c\n",c);
        System.out.printf("float f=%f\n",f);
        System.out.printf("double d=%f\n",d);
        System.out.printf("boolean bool=%b",bool);
    }
}
