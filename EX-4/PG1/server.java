import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class server{
    public static void main(String [] args)throws Exception{

        ServerSocket server =new  ServerSocket(5000);
        System.out.println("Server Opened Waiting For Connection");

        Socket socket = server.accept();
        System.out.println("Connection Made Successfull");

        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int bytes = in.read(data);

        String rmsg = new String(data,0,bytes);

        System.out.println("Recieved")




        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Msg to Send");
        String msg = sc.nextLine();
    }
}