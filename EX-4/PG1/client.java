import java.net.*;
import java.io.*;
import java.util.*;

public class client{

    public static void main(String [] args) throws Exception {

        Socket socket = new Socket("localhost",5000);

        Scanner sc = new Scanner(System.in);

        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        String cr = in.readUTF();
        System.out.println("Message Recieved:");

        System.out.println("Message is :"+cr);

        System.out.println("Enter Message to Send:");
        String cs = sc.nextLine();

        out.writeUTF(cs);
        out.flush();
        System.out.println("Message Sent:");

        socket.close();
        System.out.println("Connection Closed");
        
    }
}
