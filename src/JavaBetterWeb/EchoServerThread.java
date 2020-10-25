package JavaBetterWeb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.List;

public class EchoServerThread extends Thread {
    Socket myClient;
    List<Socket> clients;
    String clientHostname;
    int clientPort;
    public EchoServerThread(Socket ssc, List<Socket> clients) {
        super();
        this.myClient = ssc;
        this.clients = clients;
    }

    public void run(){
        InetSocketAddress clientAddress = (InetSocketAddress) myClient.getRemoteSocketAddress();
        clientHostname  = clientAddress.getHostName();
        clientPort = clientAddress.getPort();
        System.out.println("第" + clients.size() + "个客户端" + clientHostname +":" + clientPort+"已连接");
        try{
            String inStr;
            BufferedReader in = new BufferedReader(new InputStreamReader(myClient.getInputStream()));
            while((inStr = in.readLine()) != null){
                System.out.println(inStr + "。来自"+clientHostname+":"+clientPort+"");
                for(Socket client : clients){
                    if( client != null){
                        PrintWriter out = new PrintWriter(client.getOutputStream(),true);
                        out.println(inStr + "。来自"+clientHostname+":"+clientPort+"");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
