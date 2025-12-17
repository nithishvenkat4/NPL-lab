import java.net.*;
import java.io.*;
import java.util.*;

public class server{
    public static void main(String [] args) throws Exception{

        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server Starteed waiting for Client");

        Socket socket = server.accept();
        System.out.println("Connection Established");

        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Message to Send from Server:");
        String ss = sc.nextLine();

        out.writeUTF(ss);
        out.flush();
        System.out.println("Message Sent:");

        String sr = in.readUTF();
        System.out.println("Message Recieved:");
        System.out.println("Message :"+sr);

        socket.close();
        System.out.println("Connection Closed");
        server.close();
    }
}