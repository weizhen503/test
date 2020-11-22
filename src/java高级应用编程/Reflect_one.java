package java高级应用编程;
import java.lang.reflect.*;

public class Reflect_one {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class clas = Class.forName("java高级应用编程.Student");

        Object object = clas.newInstance();

        Field field = clas.getDeclaredField("name");
        field.setAccessible(true);
        field.set(object,"xiaohong");
        System.out.println(object);

        Method method = clas.getDeclaredMethod("setName", String.class);
        method.invoke(object,"xiaoming");
        System.out.println(object);

        Method tString = clas.getDeclaredMethod("toString");
        System.out.println(tString.invoke(object));

    }

}
