import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.OutputStream;

public class teacher_server {
    public static void main(String[] args) throws Exception {

        // Start server on port 5001
        ServerSocket server = new ServerSocket(5001);
        System.out.println("Teacher Server Started...");
        System.out.println("Waiting for student...\n");

        // Accept student connection
        Socket socket = server.accept();
        System.out.println("Student connected.\n");

        // Read attendance from student
        InputStream in = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int bytesRead = in.read(buffer);

        String attendance = new String(buffer, 0, bytesRead);
        System.out.println("Attendance Received from Student:");
        System.out.println(attendance + "\n");

        // Send acknowledgment to student
        OutputStream out = socket.getOutputStream();
        String reply = "Teacher: Attendance received. Thank you!";
        out.write(reply.getBytes());

        // Close connection
        socket.close();
        server.close();

        System.out.println("Server closed.");
    }
}
