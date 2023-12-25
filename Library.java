import java.lang.Iterable;
import java.util.ArrayList;
import java.lang.Comparable;

public class Library implements Iterable<Book>, Comparable<Book>{
    private ArrayList<Book> books;

    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }


}
