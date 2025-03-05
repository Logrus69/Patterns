package example.socket.udp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.*;

public class Server {

    public static final Logger logger = LogManager.getLogger(Server.class);

    public static void main(String[] args) throws UnknownHostException {

        final InetAddress address = Inet4Address.getByName("localhost");

        try (DatagramSocket serverSocket = new DatagramSocket(8080, address)) {

            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            serverSocket.receive(packet);

            logger.info("{}:{}: {}", packet.getAddress(), packet.getPort(), new String(packet.getData()));

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            logger.info("Server stopped.");
        }
    }
}
