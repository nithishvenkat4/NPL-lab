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

        
        System.out.println("Enter Number to Send from Server:");
        int ss = sc.nextInt();

        out.writeInt(ss);
        out.flush();
        System.out.println("Number Sent:");

        String sr = in.readUTF();
        System.out.println("Result Recieved:");
        System.out.println("Number "+ss+" is :"+sr);

        socket.close();
        System.out.println("Connection Closed");
        server.close();
    }
}