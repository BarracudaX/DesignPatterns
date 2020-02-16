package observer;

public interface Observable<E> {

    void register(Observer<E> observer);

    void unregister(Observer<E> observer);

    void notifyObservers(E data);
}
