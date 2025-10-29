package by.task12;

import java.util.Objects;

public class Book {
   private String title;
   private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        /*if (!(o instanceof Book book)) return false;
        return Objects.equals(String.valueOf(title.hashCode()), book.title) &&
                Objects.equals(String.valueOf(author.hashCode()), book.author);*/
        if (title.equals(book.getTitle()) && author.equals(book.getAuthor())) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return author.hashCode() + title.hashCode();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
