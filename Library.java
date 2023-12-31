import java.lang.Iterable;
import java.util.ArrayList;
// import java.lang.Comparable;
// import java.util.Comparator;
import java.util.Iterator;
import java.util.Collections;

public class Library implements Iterable<Book>{
    private static ArrayList<Book> books = new ArrayList<>();

    public static void addBook(Book book){
        books.add(book);
    }

    public static ArrayList<Book> getBooks(){
        return books;
    }

    public static void sortByName(){
        Collections.sort(books, new NameComparator());
    }

    public static void sortByAuthor(){
        Collections.sort(books, new AuthorComparator());
    }
    public static void sortByYear(){
        Collections.sort(books, new YearComparator());
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }

    public static void printBooks(){
        Iterator<Book> newItr = books.iterator();

        while(newItr.hasNext()){
            System.out.println(newItr.next());
        }
    }

    public static void removeBook(String name){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getTitle() == name) {
                books.remove(i);
            }
        }
    }

    public static void removeByAuthor(String name){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getAuthor() == name) {
                books.remove(i);
            }
        }
    }

    public static void removeByYear(int year){
        for (int i = 0; i < books.size(); i++){
            if (books.get(i).getPublishedYear() == year) {
                books.remove(i);
            }
        }
    }
}
