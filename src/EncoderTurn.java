public class EncoderTurn implements Encoder{
    public String encode(String message){
        StringBuilder messageOut= new StringBuilder();
        String[] messageArray = message.split(" ");

        for (int i = messageArray.length-1; i >= 0; i--) {
            messageOut.append(messageArray[i]).append(' ');
        }
        return messageOut.toString();
    }







}
