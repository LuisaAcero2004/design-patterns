public class Originator {
    String message;


    public Originator(String message){
        this.message = message;
    }

    Memento createMemento(){
        return new Memento(this.message);
    }

    void updateMemento(String message){
        this.message = message;

    }

    String getMessage(){
        return this.message;
    }


    public static class Memento {

        String message;

        public Memento(String message){
            this.message = message ;
        }


    }
}
