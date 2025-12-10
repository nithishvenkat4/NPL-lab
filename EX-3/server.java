import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;

public class server{
    public static void main(String [] args)throws Exception{

        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server Started:");

        Socket socket = server.accept();
        System.out.println("Server Acepted Client Req:");

        InputStream in = socket.getInputStream();

        byte[] buffer = new byte[1024];

        int bytesread = in.read(buffer);

        String message = new String(buffer,0,bytesread);
        System.out.println("Message Reached");

        System.out.println("Message :"+ message);

        socket.close();
        server.close();
        
    }
}