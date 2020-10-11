package datastruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLmethod {

    public static void main(String[] args) throws IOException  {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入网址:");
        String id=sc.next();
        java.net.URL url;
        try {
            url = new java.net.URL(id);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while((inputLine = in.readLine())!=null)
                System.out.println(inputLine);
            in.close();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
