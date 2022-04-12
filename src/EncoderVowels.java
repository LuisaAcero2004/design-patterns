public class EncoderVowels implements Encoder{
    public String encode(String message){
        message = message.replace('a','4');
        message = message.replace('e','3');
        message = message.replace('i','1');
        message = message.replace('o','0');
        message = message.replace('u','5');
        message = message.replace('A','4');
        message = message.replace('E','3');
        message = message.replace('I','1');
        message = message.replace('O','0');
        message = message.replace('U','5');
        return message;
    }
}
