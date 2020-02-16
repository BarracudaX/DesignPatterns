package observer;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {
        NewsPaper<Article> newsPaper = new NewsPaper<>();
        Reader<Article> reader = new Reader<>();

        newsPaper.notifyObservers(new Article("Article1", "Text1", LocalDate.now()));

        System.out.println("Articles received before registration: ");
        reader.printArticles();
        System.out.println("\n");

        newsPaper.register(reader);

        newsPaper.notifyObservers(new Article("Article2", "Text2", LocalDate.now()));
        newsPaper.notifyObservers(new Article("Article3", "Text3", LocalDate.now()));

        System.out.println("Article received after registration:");
        reader.printArticles();
        System.out.println("\n");

        newsPaper.unregister(reader);

        newsPaper.notifyObservers(new Article("Article4", "Text4", LocalDate.now()));

        System.out.println("Article received after removing from news paper:");
        reader.printArticles();
    }

}
