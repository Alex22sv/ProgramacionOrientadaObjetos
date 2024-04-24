package Library;
import Enums.Floor;
public class Book implements Interfaces.BookLending {
    private String ISBN;
    private String title;
    private String author;
    private Floor floor;
    private boolean isBorrowed;
    public Book(){
        this.ISBN = "";
        this.title = "";
        this.author = "";
        this.floor = null;
        this.isBorrowed = false;
    }
    public Book(String ISBN, String title, String author, Floor floor, boolean isBorrowed) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.floor = floor;
        this.isBorrowed = isBorrowed;
    }
    @Override
    public void lendBook(String ISBN) {

    }
    @Override
    public void bringBackBook() {

    }
    @Override
    public boolean isBookBorrowed(String ISBN) {
        return false;
    }
    public String getISBN() {return ISBN;}
    public void setISBN(String ISBN) {this.ISBN = ISBN;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public Floor getFloor() {return floor;}
    public void setFloor(Floor floor) {this.floor = floor;}
    public boolean isBorrowed() {return isBorrowed;}
    public void setBorrowed(boolean borrowed) {isBorrowed = borrowed;}
}
