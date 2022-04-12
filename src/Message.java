
public class Message {
    String message;

    public Message(String message){
        this.message = message;
    }

    String getInputMessage(String[] file){
        this.message = file[file.length-1];
        return this.message;
    }


}
