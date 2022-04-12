import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        ReaderWriter txtFile = new RWTxtFile("",4,"InputFile.txt");
        String[] file;
        file = txtFile.readArray();

        String inputMessage;
        String encodedMessage;
        Message message = new Message("");
        inputMessage = message.getInputMessage(file);

        System.out.println("Write the number of the selected encoder:");
        for (int i = 0; i < file.length-1 ; i++) {
            System.out.println(i + ". " + file[i]);
        }
        ReaderWriter readerConsole = new RWConsole("");
        String Option = readerConsole.read();
        String encoderOption = file[Integer.parseInt(Option)];

        EncoderFactory factory = new EncoderFactory(encoderOption);
        Encoder encoder = factory.encodeMessage();
        encodedMessage = encoder.encode(inputMessage);

        String outMessage = "Input message: " + inputMessage + "\nOutput message: " + encodedMessage;
        ReaderWriter consoleWriter = new RWConsole(outMessage);
        consoleWriter.write();
        ReaderWriter txtFileOut = new RWTxtFile(outMessage,0,"OutputFile.txt");
        txtFileOut.write();

    }
}
