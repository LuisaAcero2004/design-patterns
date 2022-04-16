import java.util.ArrayList;

public class Caretaker {
    ArrayList<Originator.Memento> historial = new ArrayList<>();

    void addMemento(Originator.Memento m){
        historial.add(m);
    }

    Originator.Memento getLastMemento(){
        int size;
        size= historial.size()-1;
        return historial.get(size);
    }
}
