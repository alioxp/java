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
			DatagramSocket socket=new DatagramSocket(30000);//�����׽��� 
			byte[] buffer;//���������ַ��� 
			buffer=new byte[35]; 
			DatagramPacket packet = new DatagramPacket(buffer , buffer.length);//�������ձ��ģ��Խ���ͨ���㲥���ݹ����� 
			System.out.println("Listening at UDP(30000)...."); 
			socket.receive(packet);//���ձ��ģ�����ͣ�͵ȴ�ֱ�����յ����� 
			socket.disconnect();//�Ͽ��׽��� 
			socket.close();//�ر��׽��� 
		}
	    catch(Exception e){//�Ѿ������ĵ�
	
	    }
		
		JFrame j =new JFrame();
		j.setSize(100, 100);
		j.add(new JLabel("Hello world!"));
		j.setVisible(true);
	}
}
