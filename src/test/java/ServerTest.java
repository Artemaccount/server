import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ServerTest {
    private Server server = new Server();
    private Client client = new Client();

    @Test
    void server_response_test() {
        String expected = "Vasya";
        client.start();
        String actual = server.response();
        Assertions.assertEquals(expected, actual);
    }
}
