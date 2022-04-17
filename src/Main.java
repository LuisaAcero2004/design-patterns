import javax.swing.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Message Encoder");
        frame.setContentPane(new encoderSelection().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
