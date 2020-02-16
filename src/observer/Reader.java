package observer;

import java.util.ArrayList;
import java.util.List;

public class Reader<T extends Article> implements Observer<T> {

    private final List<T> articles = new ArrayList<>();

    @Override
    public void notify(T article) {
        articles.add(article);
    }

    public void printArticles(){
        for (T article : articles) {
            System.out.println(article);
        }
    }

}
