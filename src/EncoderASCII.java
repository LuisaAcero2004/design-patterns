public class EncoderASCII implements Encoder{
    public String encode(String message){
        StringBuilder messageOut= new StringBuilder();
        char[] asciiMessage = message.toCharArray();

        for (char ch : asciiMessage) {
            messageOut.append((int) ch).append('.');
        }
        return messageOut.toString();
    }
}
