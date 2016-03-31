package udp;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.net.MulticastSocket;
import java.net.InetAddress;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class test {
	
	public static void main(String args[])
	{
		try
		{
			DatagramSocket socket=new DatagramSocket(30000);//创建套接字 
			byte[] buffer;//创建接收字符串 
			buffer=new byte[35]; 
			DatagramPacket packet = new DatagramPacket(buffer , buffer.length);//创建接收报文，以接收通过广播传递过来的 
			System.out.println("Listening at UDP(30000)...."); 
			socket.receive(packet);//接收报文，程序停滞等待直到接收到报文 
			socket.disconnect();//断开套接字 
			socket.close();//关闭套接字 
		}
	    catch(Exception e){//已经读完文档
	
	    }
		
		JFrame j =new JFrame();
		j.setSize(100, 100);
		j.add(new JLabel("Hello world!"));
		j.setVisible(true);
	}
}
