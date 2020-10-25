package JavaBetterWeb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class EchoSever {
	List<Socket> clients = new ArrayList<Socket>();
	ServerSocket ssc;
	public EchoSever() throws IOException {
		 ssc = new ServerSocket(7);
		 while(true) {
			 Socket sc = ssc.accept();
			 clients.add(sc);
			 new EchoServerThread(sc, clients).start();
		 }
	}

	public static void main(String[] args) throws IOException {
		new EchoSever();
	}

}
