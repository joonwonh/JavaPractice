package SocketEx;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.net.Socket;

public class ClientSocket {

	public static void main(String[] args) {
		try	{
			Socket s = new Socket("172.30.1.41", 9999);
			
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("해킹한다 수고요");
			dout.flush();
			dout.close();
			
			s.close();
			
		}catch(Exception e)	{
			System.out.println(e);
		}
	}

}
