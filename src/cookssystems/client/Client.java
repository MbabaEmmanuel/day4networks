package cookssystems.client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.net.UnknownHostException;

import java.io.OutputStream;

public class Client {
	public static void main(String[] args)
	{
		try 
		(
				
		Socket s = new Socket("10.1.1.143", 12345);
		
		OutputStream out =  s.getOutputStream();
		Writer write = new OutputStreamWriter(out);
		Writer wr = new BufferedWriter(write);
				
				
				
		)	
		
		{
			wr.write("Emmanuel Mbaba");
			wr.flush();
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}


