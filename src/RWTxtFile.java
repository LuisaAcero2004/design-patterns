import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileWriter;

public class RWTxtFile extends ReaderWriter {
    int lines;
    String fileName;



    public RWTxtFile(String message, int lines, String fileName) {
        super(message);
        this.lines = lines;
        this.fileName = fileName;

    }

    @Override
    String[] readArray() throws FileNotFoundException {
        String[] content = new String[lines];
        Path currentRelativePath = Paths.get("");
        String path = currentRelativePath.toAbsolutePath().toString();
        path = path + "\\src\\" + fileName;
        File file = new File(path);
        Scanner scan = new Scanner(file);

        for (int i = 0;scan.hasNextLine();i++){
            content[i] = scan.nextLine();
        }
       return content;
    }

    @Override
    void write() throws IOException {
        Path currentRelativePath = Paths.get("");
        String path = currentRelativePath.toAbsolutePath().toString();
        path = path + "\\src\\" + fileName;
        FileWriter writer = new FileWriter(path);
        writer.write(this.message);
        writer.close();

    }

}
