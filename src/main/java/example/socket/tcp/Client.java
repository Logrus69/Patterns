package example.socket.tcp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static final Logger logger = LogManager.getLogger(Client.class);

    public static void main(String[] args) throws UnknownHostException {

        InetAddress localhost = Inet4Address.getByName("localhost");

        try (Socket socket = new Socket(localhost, 8080);
             DataInputStream response = new DataInputStream(socket.getInputStream());
             DataOutputStream request = new DataOutputStream(socket.getOutputStream())) {

            //socket.setSoTimeout(5000); //таймаут не разрывает соединение а просто выбрасывает исключение если данных нету
            socket.setTcpNoDelay(true); //Заставляет сокет отправлять данные немедленно, а не собирать в пакеты
            socket.setKeepAlive(true); //периодически отправляет пустые пакеты keep-alive probes и если ответа нету закрывает соединение.

            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                request.writeUTF(scanner.nextLine());
                logger.info("Response from server: {}", response.readUTF());
            }

        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            logger.info("Client socket stopped");
        }
    }
}
