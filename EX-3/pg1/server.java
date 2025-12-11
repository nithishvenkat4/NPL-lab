import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;

 public class server{
    public static void main(String [] args)throws Exception{

        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server Started waiting For Client");

        Socket socket = server.accept();
        System.out.println("Client Connected");

        InputStream in = socket.getInputStream();

        byte[] data = new byte[1024];

        int bytesread = in.read(data);

        String message = new String(data,0,bytesread);

        System.out.println("Message Recieved : ");
        System.out.println("Message : "+message);

        socket.close();
        System.out.println("Connection Closed");
        server.close();

    }
 }