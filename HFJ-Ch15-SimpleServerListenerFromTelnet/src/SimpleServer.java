import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * A simple server socket listener that listens to port number 8888, and prints
 * whatever received to the console.
 */
public class SimpleServer {
   
   private ServerSocket server;
   private int serverPort = 5000;
   
   // Constructor to allocate a ServerSocket listening at the given port.
   public SimpleServer() {
      try {
         server = new ServerSocket(serverPort);
         System.out.println("ServerSocket: " + server);
         System.out.println("*****************************\n");
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
   
   // Start listening.
   private void listen() {
      while (true) { // run until you terminate the program
         try {
            // Wait for connection. Block until a connection is made.
            System.out.println("Waiting for new client");
        	Socket socket = server.accept();
            System.out.println("Connected - ClientSocket: " + socket);
            /*InputStream in = socket.getInputStream();
            int byteRead;
            // Block until the client closes the connection (i.e., read() returns -1)
            while ((byteRead = in.read()) != -1) {
               System.out.print((char)byteRead);
            }*/
            BufferedReader br = new BufferedReader(
            						new InputStreamReader(
            							socket.getInputStream()));
            String recived="";
            while( ! (recived=br.readLine()).equals("ende") )
            	System.out.println("recived: " + recived);
            System.out.println("*****************************\n");
          
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
   
   public static void main(String[] args) {
      new SimpleServer().listen();  // Start the server and listening
   }
}