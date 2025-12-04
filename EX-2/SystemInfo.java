import java.net.*;
import java.io.*;

public class SystemInfo {
    public static void main(String[] args) {
        try {
            // ----------- IP Address & Host Name -----------
            InetAddress inet = InetAddress.getLocalHost();
            System.out.println("Host Name   : " + inet.getHostName());
            System.out.println("IP Address  : " + inet.getHostAddress());


            // ----------- MAC Address -----------
            NetworkInterface network = NetworkInterface.getByInetAddress(inet);
            byte[] mac = network.getHardwareAddress();

            System.out.print("MAC Address : ");
            if (mac != null) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < mac.length; i++) {
                    sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
                }
                System.out.println(sb.toString());
            } else {
                System.out.println("MAC address not found.");
            }


            // ----------- URL Components -----------
            URL url = new URL("https://www.google.com/search?q=java");

            System.out.println("\nURL Components:");
            System.out.println("Protocol : " + url.getProtocol());
            System.out.println("Host     : " + url.getHost());
            System.out.println("Port     : " + url.getPort());
            System.out.println("Path     : " + url.getPath());
            System.out.println("Query    : " + url.getQuery());
            System.out.println("File     : " + url.getFile());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
