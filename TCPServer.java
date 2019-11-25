import java.net.*;
import java.io.*;

class TCPServer{
     public static void main (String[] args) {
	try{
                Socket ServerSocket;
                 while (true) {
                        serverSocket = new ServerSocket(2222);
                        DataInputStream in = new DataInputStream(socket.getInputStream());
                        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                        //Received data
                        System.out.println("Received: "+ in.readUTF());
                        //send data
                        out.writeUTF("ACK 220 OK!!");  
                 }                
        }catch(Exception e){
            //
        }
     }
}