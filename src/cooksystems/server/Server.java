package cooksystems.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args)
	{
	
		try(
	
			ServerSocket ss = new ServerSocket(12345);
			
			Socket s = ss.accept();
			
			InputStream in = s.getInputStream();
			Reader read = new InputStreamReader(in);
			BufferedReader buff = new BufferedReader(read);
			
		)
		
				{
			System.out.println(buff.readLine());
		}
		
			
		
		catch 
		(IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		
		
		
	}

}
