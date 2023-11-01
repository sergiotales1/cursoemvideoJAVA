package Library;

public class Book {
    private String bookTitle, genre;
    private int totPage;
    private boolean available;

    public Book(String bookTitle, String genre, int totPage){
        this.bookTitle = bookTitle;
        this.genre = genre;
        this.totPage = totPage;
        this.available = true;
    }


    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTotPage() {
        return totPage;
    }

    public void setTotPage(int totPage) {
        this.totPage = totPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", genre='" + genre + '\'' +
                ", totPage=" + totPage +
                '}';
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
