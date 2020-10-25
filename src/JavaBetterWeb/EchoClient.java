package JavaBetterWeb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	
	public static void main(String[] args) throws IOException{
		String hostname="";
		int portnum=7;
		Socket echoSocket = new Socket(hostname,portnum);
		PrintWriter out = new PrintWriter(echoSocket.getOutputStream(),true);
		BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
		BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					String str ;
					while((str=strIn.readLine())!=null) {
						out.println(str);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		}).start();
		
		 
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					String str;
					while((str=in.readLine())!=null) {
						System.out.println(str);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		}).start();
	}

}
