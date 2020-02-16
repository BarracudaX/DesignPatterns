package observer;

import java.time.LocalDate;

public class Article {

    private final String name;

    private final String text;

    private final LocalDate created;

    public Article(String name, String text, LocalDate created) {
        this.name = name;
        this.text = text;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public LocalDate getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", created=" + created +
                '}';
    }
}
