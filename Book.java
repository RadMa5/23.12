import java.lang.Comparable;

public class Book implements Comparable<Book>{
    protected String title;
    protected String author;
    protected Integer publishedYear;

    public void book(String title, String author, Integer publishedYear){
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPublishedYear(){
        return publishedYear;
    }

    @Override
    public String toString(){
        return new String(title + " by " + author + ". Published in " + publishedYear);
    }

    @Override
    public int compareTo(Book o){
        return this.title.compareTo(o.title);
    }
}