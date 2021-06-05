import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(8090);
            System.out.println("Server started");
            Socket clientSocket = serverSocket.accept();
            System.out.println("New connection accepted");
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            final String name = in.readLine();
            out.println(String.format("Hi %s, your port is %d", name, clientSocket.getPort()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String response(){
        String response = null;
        try {
            ServerSocket serverSocket = new ServerSocket(8090);
            Socket clientSocket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            response = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } return response;
    }
}
