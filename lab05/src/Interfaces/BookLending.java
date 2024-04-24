package Interfaces;

public interface BookLending {
    void lendBook(String ISBN);
    void bringBackBook();
    boolean isBookBorrowed(String ISBN);
}
