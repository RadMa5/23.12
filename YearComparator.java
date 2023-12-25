import java.util.Comparator;

public class YearComparator implements Comparator<Book> {
    public int compare(Book a, Book b){
        return Integer.compare(a.getPublishedYear(), b.getPublishedYear());
    }
}
