import java.net.*;
import java.io.*;
import java.util.*;

public class client{

    public static void main(String [] args) throws Exception {

        Socket socket = new Socket("localhost",5000);

        Scanner sc = new Scanner(System.in);

        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        int cr = in.readInt();
        System.out.println("Number Recieved:");

        System.out.println("Number is :"+cr);
        String cs="";
        if(cr%2==0){cs="Even";}
        else{cs="Odd";}

        out.writeUTF(cs);
        out.flush();
        System.out.println("Result Sent:");

        socket.close();
        System.out.println("Connection Closed");
        
    }
}
