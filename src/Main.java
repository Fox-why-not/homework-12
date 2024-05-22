import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();

        Author DEN = new Author("DEN", "DA");
       Book fuuulk = new Book("Фак", DEN , currentYear);
        System.out.println("Автора книги - " + fuuulk.getName() + " зовут " + DEN.getName() + " " + DEN.getMiddleName() + ", год издания книги " + fuuulk.getPublicYear());
fuuulk.setPublicYear(2011);
        System.out.println("Автора книги - " + fuuulk.getName() + " зовут " + DEN.getName() + " " + DEN.getMiddleName() + ", год издания книги " + fuuulk.getPublicYear());

        Author Fox = new Author("Fox", "WhyNot");
        Book AboutMyPain = new Book("AboutMyPain", Fox , currentYear);

        Author Lexa = new Author("Lexa", "Chighow");
        Book ForWakeUp = new Book("100ForWakeUp", Lexa , currentYear);

    }
}
