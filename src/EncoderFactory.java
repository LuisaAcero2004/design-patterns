public class EncoderFactory {
    String name;


    public EncoderFactory(String name){
        this.name = name;
    }



    public Encoder encodeMessage(){
        switch (this.name){
            case "replace vowels":
                return new EncoderVowels();
            case "turn message":
                return new EncoderTurn();
            case "replace ASCII":
                return new EncoderASCII();
            default:
                throw new IllegalStateException("Invalid encoder selected");


        }
    }





}
