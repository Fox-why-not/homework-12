import java.time.LocalDate;

public class Book {
    private final String name;
    private final Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public void setPublicationYear (int publicationYear){
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Имя " + this.name + ", Author " + this.publicationYear;
    }


}

