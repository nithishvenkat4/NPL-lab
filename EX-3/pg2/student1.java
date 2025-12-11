import java.net.Socket;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.Scanner;

public class student1 {
    public static void main(String[] args) throws Exception {


        Socket socket = new Socket("127.0.0.1", 5001);
        System.out.println("Connected to Teacher.\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String roll = sc.nextLine();

        System.out.print("Enter Attendance (Present/Absent): ");
        String att = sc.nextLine();

        String message = name + "Roll" +roll+ " - " + att;

        OutputStream out = socket.getOutputStream();
        out.write(message.getBytes());
        System.out.println("\nAttendance Sent!\n");


        InputStream in = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int bytesRead = in.read(buffer);

        String reply = new String(buffer, 0, bytesRead);
        System.out.println("Reply from Teacher:");
        System.out.println(reply);

        socket.close();
    }
}
