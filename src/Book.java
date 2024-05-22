public class Book {
    private String name;
    private Author author;
    private int publicYear;

    public Book(String name, Author author, int publicYear) {
        this.name = name;
        this.author = author;
        this.publicYear = publicYear;

    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }



    public int getPublicYear() {
        return this.publicYear;
    }

    public void setPublicYear (int publicYear){
        this.publicYear = publicYear;
    }
}

