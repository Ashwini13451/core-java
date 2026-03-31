class BookeExecuter {

    public static void main(String[] args) {

        // Example first object
        Book book = new Book();
        book.bookId = 1;
        book.bookName = "Java Basics";
        book.author = "Ashwini";
        book.price = 499.0;
        book.available = true;

        Library library = new Library();
        library.libraryId = 101;
        library.libraryName = "City Library";
        library.location = "Bangalore";
        library.open = true;
        library.book = book;

        library.getLibraryDetails();

        // ----------- Object 1 -----------
        Book book1 = new Book();
        book1.bookId = 2;
        book1.bookName = "Python Essentials";
        book1.author = "Ravi";
        book1.price = 399.0;
        book1.available = true;

        Library library1 = new Library();
        library1.libraryId = 102;
        library1.libraryName = "Central Library";
        library1.location = "Chennai";
        library1.open = true;
        library1.book = book1;

        library1.getLibraryDetails();

        // ----------- Object 2 -----------
        Book book2 = new Book();
        book2.bookId = 3;
        book2.bookName = "Data Structures";
        book2.author = "Priya";
        book2.price = 599.0;
        book2.available = false;

        Library library2 = new Library();
        library2.libraryId = 103;
        library2.libraryName = "State Library";
        library2.location = "Hyderabad";
        library2.open = false;
        library2.book = book2;

        library2.getLibraryDetails();

        // ----------- Object 3 -----------
        Book book3 = new Book();
        book3.bookId = 4;
        book3.bookName = "C++ Complete Guide";
        book3.author = "Kiran";
        book3.price = 450.0;
        book3.available = true;

        Library library3 = new Library();
        library3.libraryId = 104;
        library3.libraryName = "Town Library";
        library3.location = "Mumbai";
        library3.open = true;
        library3.book = book3;

        library3.getLibraryDetails();

        // ----------- Object 4 -----------
        Book book4 = new Book();
        book4.bookId = 5;
        book4.bookName = "Algorithms";
        book4.author = "Sneha";
        book4.price = 700.0;
        book4.available = true;

        Library library4 = new Library();
        library4.libraryId = 105;
        library4.libraryName = "National Library";
        library4.location = "Pune";
        library4.open = true;
        library4.book = book4;

        library4.getLibraryDetails();

        // ----------- Object 5 -----------
        Book book5 = new Book();
        book5.bookId = 6;
        book5.bookName = "Operating Systems";
        book5.author = "Arjun";
        book5.price = 650.0;
        book5.available = false;

        Library library5 = new Library();
        library5.libraryId = 106;
        library5.libraryName = "Metro Library";
        library5.location = "Delhi";
        library5.open = false;
        library5.book = book5;

        library5.getLibraryDetails();

        // ----------- Object 6 -----------
        Book book6 = new Book();
        book6.bookId = 7;
        book6.bookName = "Networks Fundamentals";
        book6.author = "Meena";
        book6.price = 550.0;
        book6.available = true;

        Library library6 = new Library();
        library6.libraryId = 107;
        library6.libraryName = "City Library";
        library6.location = "Chennai";
        library6.open = true;
        library6.book = book6;

        library6.getLibraryDetails();

        // ----------- Object 7 -----------
        Book book7 = new Book();
        book7.bookId = 8;
        book7.bookName = "Database Management";
        book7.author = "Vikram";
        book7.price = 600.0;
        book7.available = true;

        Library library7 = new Library();
        library7.libraryId = 108;
        library7.libraryName = "Central Library";
        library7.location = "Bangalore";
        library7.open = true;
        library7.book = book7;

        library7.getLibraryDetails();

        // ----------- Object 8 -----------
        Book book8 = new Book();
        book8.bookId = 9;
        book8.bookName = "Web Development";
        book8.author = "Divya";
        book8.price = 350.0;
        book8.available = false;

        Library library8 = new Library();
        library8.libraryId = 109;
        library8.libraryName = "State Library";
        library8.location = "Hyderabad";
        library8.open = false;
        library8.book = book8;

        library8.getLibraryDetails();

        // ----------- Object 9 -----------
        Book book9 = new Book();
        book9.bookId = 10;
        book9.bookName = "Machine Learning";
        book9.author = "Rahul";
        book9.price = 800.0;
        book9.available = true;

        Library library9 = new Library();
        library9.libraryId = 110;
        library9.libraryName = "Town Library";
        library9.location = "Pune";
        library9.open = true;
        library9.book = book9;

        library9.getLibraryDetails();

        
    }
}