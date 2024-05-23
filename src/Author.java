import java.util.Objects;

public class Author {
        private final String name;
        private final String lastName;

        public Author (String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

    public String toString() {
        return this.name + this.lastName;
    }
    public int hashCode() {
            return Objects.hash(name,lastName);
    }
}
