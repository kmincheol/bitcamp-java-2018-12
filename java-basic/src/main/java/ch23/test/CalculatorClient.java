package ch23.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class CalculatorClient {
  public static void main(String[] args) {
    try (Scanner key = new Scanner(System.in);
        Socket socket = new Socket("localhost", 8888);
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {

      while (true) {
        System.out.print("> ");
        String input = key.nextLine();
        
        out.println(input);
        out.flush();

        String reponse = in.readLine();
        System.out.println(reponse);
        
        if (input.equalsIgnoreCase("quit")) 
          break;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
