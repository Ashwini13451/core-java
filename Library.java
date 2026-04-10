class Library {

    String bookNames[] = new String[13];
    int index;

    // create operation
    public boolean addBook(String book) {
        boolean isBookAdded = false;

        if (index < bookNames.length) {

            if (book != null && !book.isEmpty()) {
                bookNames[index++] = book;
                isBookAdded = true;

            } else {
                System.out.println(book + " not added");
            }

        } else {
            System.out.println("Book list is already full");
        }

        return isBookAdded;
    }

    // read operation
    public void getBooks() {
        System.out.println("The available books are:");
        for (String book : bookNames)
            System.out.println(book);
    }
}