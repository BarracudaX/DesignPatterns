package observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper<T extends Article> implements Observable<T> {

    private final List<Observer<T>> observers = new ArrayList<>();

    @Override
    public void register(Observer<T> observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer<T> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(T data) {
        for (Observer<T> observer : observers) {
            observer.notify(data);
        }
    }

}
