package java高级应用编程;
import java.lang.reflect.*;
import java.io.*;

public class Reflect_two {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        String[] str = new String[2];
        String temp;
        int index = 0;

        BufferedReader read = new BufferedReader(new FileReader("D:\\ideaWork\\test\\src\\java高级应用编程\\test.txt"));
        while((temp = read.readLine())!=null){
            str[index] = temp;
            index ++;
        }

        Class clas = Class.forName("java高级应用编程."+str[0]);
        Object object = clas.newInstance();

        Method method = clas.getDeclaredMethod(str[1]);
        method.invoke(object);
    }
}
