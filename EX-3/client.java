import java.net.Socket;
import java.io.OutputStream;

public class client {
    public static void main(String [] args)throws Exception{

        Socket socket = new Socket("127.0.0.1",5000);
        System.out.println("Client : Connected");

        String message ="Hello |";

        OutputStream out = socket.getOutputStream();

        byte[] bytes =message.getBytes();

        out.write(bytes);

        System.out.println("Message Sent");

        socket.close();
    }
}