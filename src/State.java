import java.util.ArrayList;
import java.util.List;

public class State {
    private List<Observer> ob = new ArrayList<>();
    private int state;

    public void setState(int state) {
        this.state = state;
        observers();
    }

    public int getState() {
        return state;
    }

    public void add(Observer obs) {
        ob.add(obs);
    }

    public void observers(){
        for (Observer observer : ob) {
            observer.changeData();
        }
    }
}