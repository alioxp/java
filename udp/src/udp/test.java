package udp;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.net.MulticastSocket;
import java.net.InetAddress;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import it.sauronsoftware.ftp4j.FTPClient;
public class test {
	
	static FTPClient client = new FTPClient();
	
	public static void main(String args[])
	{
		
		try
		{
			/*
			DatagramSocket socket=new DatagramSocket(30000);//创建套接字 
			byte[] buffer;//创建接收字符串 
			buffer=new byte[35]; 
			DatagramPacket packet = new DatagramPacket(buffer , buffer.length);//创建接收报文，以接收通过广播传递过来的 
			System.out.println("Listening at UDP(30000)...."); 
			socket.receive(packet);//接收报文，程序停滞等待直到接收到报文 
			socket.disconnect();//断开套接字 
			socket.close();//关闭套接字 
			*/
			
			
			//Connect now to a remote FTP service:

			client.connect("127.0.0.1");
			//If the service port is other than the standard 21 (or 990 if FTPS):

			//client.connect("ftp.host.com", port);
			//In example:

			//client.connect("ftp.host.com", 8021);
			//Step now to the login procedure:

			client.login("aa", "aa");
		}
	    catch(Exception e){//已经读完文档
	
	    }
		
		JFrame j =new JFrame();
		j.setSize(100, 100);
		j.add(new JLabel("Hello world!"));
		j.setVisible(true);
	}
}
