import java.io.*;
import java.io.InputStreamReader;

public class RWConsole extends ReaderWriter {

    public RWConsole(String message){
        super(message);

    }

    @Override
    String read() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    @Override
    public void write(){
        System.out.println(this.message);
    }

}
