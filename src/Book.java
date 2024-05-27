import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Имя " + this.name + ", Author " + this.publicationYear;
    }
    public boolean equals(Object o) {
        if (this == o) return  true;
        if (!(o instanceof Book book)) return false;
        Author author = (Author) o;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(name, author, publicationYear);
    }
}

