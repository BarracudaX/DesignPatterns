package decorator;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class StatisticListDecorator<E> implements List<E> {

    private final Map<String, AtomicInteger> counters = new ConcurrentHashMap<>();

    private final List<E> wrappedList;

    public StatisticListDecorator(List<E> wrappedList) {
        this.wrappedList = wrappedList;
    }

    @Override
    public int size() {
        increaseCounter("size");
        return wrappedList.size();
    }

    @Override
    public boolean isEmpty() {
        increaseCounter("isEmpty");
        return wrappedList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        increaseCounter("contains");
        return wrappedList.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        increaseCounter("iteratorAndComposite");
        return wrappedList.iterator();
    }

    @Override
    public Object[] toArray() {
        increaseCounter("toArray");
        return wrappedList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        //
        return wrappedList.toArray(a);
    }

    @Override
    public boolean add(E e) {
        increaseCounter("add");
        return wrappedList.add(e);
    }

    @Override
    public boolean remove(Object o) {
        increaseCounter("remove");
        return wrappedList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        increaseCounter("containsAll");
        return wrappedList.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        increaseCounter("addAll");
        return wrappedList.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        //
        return wrappedList.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        //
        return wrappedList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        increaseCounter("retainAll");
        return wrappedList.retainAll(c);
    }

    @Override
    public void clear() {
        increaseCounter("clear");
        wrappedList.clear();
    }

    @Override
    public E get(int index) {
        increaseCounter("get");
        return wrappedList.get(index);
    }

    @Override
    public E set(int index, E element) {
        increaseCounter("set");
        return wrappedList.set(index,element);
    }

    @Override
    public void add(int index, E element) {
        //
        wrappedList.add(index,element);
    }

    @Override
    public E remove(int index) {
        //
        return wrappedList.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        increaseCounter("indexOf");
        return wrappedList.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        increaseCounter("lastIndexOf");
        return wrappedList.lastIndexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
        increaseCounter("listIterator");
        return wrappedList.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        //
        return wrappedList.listIterator(index);
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        increaseCounter("subList");
        return wrappedList.subList(fromIndex,toIndex);
    }

    public void registerCounter(String methodName) {
        counters.put(methodName, new AtomicInteger());
    }

    public void printStatistics(){
        for (Map.Entry<String, AtomicInteger> counter : counters.entrySet()) {
            System.out.println("Method "+counter.getKey()+" was called "+counter.getValue().intValue());
        }
    }

    private void increaseCounter(String methodName) {
        AtomicInteger counter = counters.get(methodName);
        if (counter != null) {
            counter.incrementAndGet();
        }
    }

}
