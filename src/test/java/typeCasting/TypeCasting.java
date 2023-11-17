public class TypeCasting {

    public static void main(String args[])
    {
        TypeCasting.m1();
        TypeCasting.m2();
    }

    public static void m1()
    {
        Object object = new String("Welcome");
        String string = (String) object;
        System.out.println(string);
    }

    public static void m2()
    {
        Object object = new String("Welcome");
        StringBuffer stringBuffer = (StringBuffer)object;
        System.out.println(stringBuffer);
    }

}
