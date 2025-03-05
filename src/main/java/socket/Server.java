package socket;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static final Logger logger = LogManager.getLogger(Server.class);

    public static void main(String[] args) {
    logger.info("Server started");
        try (ServerSocket serverSocket = new ServerSocket(8080);
             Socket clientSocket = serverSocket.accept();
             DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
             DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream())) {

            String stopWord = "Stop";

            Scanner scanner = new Scanner(System.in);
            String request = inputStream.readUTF();
            while (!request.equals(stopWord)) {

                logger.info("Request from client server: {}", request);
                outputStream.writeUTF(scanner.nextLine());
                request = inputStream.readUTF();
            }
            logger.info("Request from client server: {}", request);
            outputStream.writeUTF("You entered a stop word. The session is over.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            logger.info("Server socket stopped");
        }
    }
}
