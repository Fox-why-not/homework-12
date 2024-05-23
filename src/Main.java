import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();

        Author DEN = new Author("DEN", "DA");
        Book fuuulk = new Book("Фак", DEN, currentYear);

        System.out.println(fuuulk);
        fuuulk.setPublicationYear(2011);
        System.out.println(fuuulk);

        Author Fox = new Author("Fox", "WhyNot");
        Book AboutMyPain = new Book("AboutMyPain", Fox, currentYear);

        Author Lexa = new Author("Lexa", "Chighow");
        Book ForWakeUp = new Book("100ForWakeUp", Lexa, currentYear);

        System.out.println(Fox.equals(Lexa));

    }
}
