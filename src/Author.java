public class Author {
        private String name;
        private String middleName;

        public Author (String name, String middleName) {
            this.name = name;
            this.middleName = middleName;
        }

        public String getName() {
            return this.name;
        }

        public String getMiddleName() {
            return this.middleName;
        }

    public static void main(String[] args) {

        Author DEN = new Author("DEN", "DA");

        System.out.println("DEN.name = " + DEN.name);
        System.out.println("DEN.middleName = " + DEN.middleName);

    }
    }
