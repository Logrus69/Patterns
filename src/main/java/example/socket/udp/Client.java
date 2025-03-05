package example.socket.udp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.*;

public class Client {

    public static final Logger logger = LogManager.getLogger(Client.class);

    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = Inet4Address.getByName("localhost");

        try (DatagramSocket clientSocket = new DatagramSocket()) {

            byte[] buffer = "Hello World".getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 8080);
            clientSocket.send(packet);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            logger.info("Client closed");
        }
    }
}
