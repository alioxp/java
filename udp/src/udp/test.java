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
			DatagramSocket socket=new DatagramSocket(30000);//�����׽��� 
			byte[] buffer;//���������ַ��� 
			buffer=new byte[35]; 
			DatagramPacket packet = new DatagramPacket(buffer , buffer.length);//�������ձ��ģ��Խ���ͨ���㲥���ݹ����� 
			System.out.println("Listening at UDP(30000)...."); 
			socket.receive(packet);//���ձ��ģ�����ͣ�͵ȴ�ֱ�����յ����� 
			socket.disconnect();//�Ͽ��׽��� 
			socket.close();//�ر��׽��� 
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
	    catch(Exception e){//�Ѿ������ĵ�
	
	    }
		
		JFrame j =new JFrame();
		j.setSize(100, 100);
		j.add(new JLabel("Hello world!"));
		j.setVisible(true);
	}
}
