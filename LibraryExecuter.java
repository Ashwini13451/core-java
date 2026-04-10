class LibraryExecuter {

    public static void main(String[] a) {

        Library ref = new Library();

        boolean added = ref.addBook("Java Basics");

        added = ref.addBook("Python Programming");
        System.out.println(added);

        added = ref.addBook("C Programming");
        added = ref.addBook("Data Structures");
        added = ref.addBook("Algorithms");
        added = ref.addBook("Operating Systems");
        added = ref.addBook("Computer Networks");
        added = ref.addBook("Database Systems");
        added = ref.addBook("Software Engineering");
        added = ref.addBook("Artificial Intelligence");
        added = ref.addBook("Machine Learning");
        added = ref.addBook("Cyber Security");
        added = ref.addBook("Cloud Computing");

        // extra book to check full condition
        added = ref.addBook("Extra Book");

        ref.getBooks();
    }
}