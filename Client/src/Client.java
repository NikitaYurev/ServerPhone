import nikita.Phone;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        //IP: 192.168.178.24:8000
        try (Phone phone = new Phone("192.168.178.24", 8000)) {

            System.out.println("Connected to server");
            String request = "Visaginas";
            System.out.println("Request: " + request);
            phone.writeLine(request);

            String response = phone.readLine();
            System.out.println("Response: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}