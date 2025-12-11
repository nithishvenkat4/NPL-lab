import java.net.Socket;
import java.io.OutputStream;
import java.util.Scanner;


public  class client{
    public static void main(String [] args)throws Exception{


        Socket socket = new Socket("127.0.0.1",5000);
        System.out.println("Connection Made:");

        OutputStream out = socket.getOutputStream();

        Scanner scanner = new Scanner(System.in); 
        String message = scanner.nextLine();
        
        byte[] data = message.getBytes();

        out.write(data);

        System.out.println("Message Sent");

        socket.close();
        System.out.println("Connection Closed");
     
    }
}