import java.net.*;
import java.io.*;

class TCPClient{
 public static void main (String[] args) {
 	Socket socketClient;
	try{
            socketClient = new Socket(args[0], 2157); // (ip,port)
            DataInputStream in = new DataInputStream(socketClient.getInputStream());
            DataOutputStream out = new DataOutputStream(socketClient.getOutputStream());

	    //send data
            out.writeUTF(args[1]);
	    //Received data
	    System.out.println("Received: "+ in.readUTF());

        }catch(Exception e){
            //
        }
 }
}