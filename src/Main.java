import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        ReaderWriter txtFile = new RWTxtFile("",4,"InputFile.txt");
        String[] file;
        file = txtFile.readArray();

        Originator message = new Originator(file[file.length-1]);

        System.out.println("Write the number of the selected encoder:");
        for (int i = 0; i < file.length-1 ; i++) {
            System.out.println(i + ". " + file[i]);
        }

        ReaderWriter readerConsole = new RWConsole("");
        String Option = readerConsole.read();
        String encoderOption = file[Integer.parseInt(Option)];

        EncoderFactory factory = new EncoderFactory(encoderOption);
        Encoder encoder = factory.encodeMessage();
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(message.createMemento());
        message.updateMemento(encoder.encode(message.getMessage()));

        String outMessage = String.format("Input message: %s\nOutput message: %s", caretaker.getLastMemento().message, message.getMessage());
        ReaderWriter consoleWriter = new RWConsole(outMessage);
        consoleWriter.write();
        ReaderWriter txtFileOut = new RWTxtFile(outMessage,0,"OutputFile.txt");
        txtFileOut.write();

    }
}
