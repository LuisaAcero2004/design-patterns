import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class encoderSelection {


    public JComboBox comboBox1;
    public JPanel panel1;
    public JButton encodeButton;
    private JLabel inputMessage;
    private JLabel outputMessage;

    public encoderSelection() throws IOException {
        ReaderWriter txtFile = new RWTxtFile("",4,"InputFile.txt");
        String[] file;
        file = txtFile.readArray();

        for (int i = 0; i < file.length-1 ; i++) {
            comboBox1.addItem(file[i]);
        }


        encodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Originator message = new Originator(file[file.length-1]);
                String encoderOption = comboBox1.getSelectedItem().toString();
                EncoderFactory factory = new EncoderFactory(encoderOption);
                Encoder encoder = factory.encodeMessage();
                Caretaker caretaker = new Caretaker();
                caretaker.addMemento(message.createMemento());
                message.updateMemento(encoder.encode(message.getMessage()));
                inputMessage.setText("Input message: " + caretaker.getLastMemento().message);
                outputMessage.setText("Output message: " + message.getMessage());

                String outMessage = String.format("Input message: %s\nOutput message: %s", caretaker.getLastMemento().message, message.getMessage());
                ReaderWriter consoleWriter = new RWConsole(outMessage);
                try {
                    consoleWriter.write();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                ReaderWriter txtFileOut = new RWTxtFile(outMessage,0,"OutputFile.txt");
                try {
                    txtFileOut.write();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
