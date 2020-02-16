package decorator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        StatisticListDecorator<String> list = new StatisticListDecorator<>(new ArrayList<>());
        list.registerCounter("add");
        list.registerCounter("remove");

        addItems(list, new String[]{"item1","item2","item3"});

        removeItems(list, new String[]{"item2","item3"});

        list.printStatistics();
    }

    private static void addItems(List<String> list, String... items) {
        for (String item : items) {
            list.add(item);
        }
    }

    private static void removeItems(List<String> list, String... items) {
        for (String item : items) {
            list.remove(item);
        }
    }

}
