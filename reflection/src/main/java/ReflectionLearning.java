

import java.lang.reflect.*;


public class ReflectionLearning {

    public static void main(String[] args) {
        try{
//
//            String a = new String("red");
//            System.out.println(String.getDeclaredMethods());
//
            Class c = Class.forName("String");
//            Class c = Class.forName(args[0]);
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++)
                System.out.println(m[i].toString()); //I seem to be getting the exception...
        }
        catch (Throwable e)
        {
            System.out.println(e);
        }
    }

}
