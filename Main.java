public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Title1", "bbb", 1999);
        Book b2 = new Book("Title2", "a", 1888);
        Book b3 = new Book("aaa", "zzz", 1700);

        Library.addBook(b1);
        Library.addBook(b2);
        Library.addBook(b3);

        Library.printBooks();

        Library.sortByName();
        Library.printBooks();

        Library.sortByAuthor();
        Library.printBooks();

        Library.sortByYear();
        Library.printBooks();

        Library.removeBook("Title1");
        Library.printBooks();
    }
    
}
