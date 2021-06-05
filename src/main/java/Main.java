import java.io.IOException;

public class Main {
    private static final String HOST = "localhost";
    private static final int PORT = 8090;
    public static void main(String[] args) throws IOException {
        Server server = new Server();
        Client client = new Client();
        server.start();
        client.start();
    }
}
