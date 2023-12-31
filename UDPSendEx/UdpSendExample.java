package UDPSendEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UdpSendExample {

	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("[발신시작]");
		
		while(true)	{
			String data = br.readLine();
			if(data.equals("exit")	)	{
					break;}
			byte[] byteArr = data.getBytes("UTF-8");
			DatagramPacket packet = new DatagramPacket(
					byteArr,byteArr.length,
					new InetSocketAddress("172.30.1.90", 5001));
					
			datagramSocket.send(packet);
			System.out.println("[보낸 바이트 수] : " + byteArr.length + "bytes");
			
		}
		System.out.println("[발신 종료]");
		
		datagramSocket.close();
	}

}
