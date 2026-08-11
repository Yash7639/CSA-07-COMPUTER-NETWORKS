import java.net.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter hostname: ");
            String hostname = sc.nextLine();

            InetAddress address = InetAddress.getByName(hostname);

            System.out.println("DNS Server resolved the hostname.");
            System.out.println("Hostname: " + hostname);
            System.out.println("IP Address: " + address.getHostAddress());

            sc.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}