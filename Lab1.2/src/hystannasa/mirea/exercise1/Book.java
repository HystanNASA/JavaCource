package hystannasa.mirea.exercise1;

public class Book {
    private String title;
    private String author;
    private int yearOfPublishing;
    private int pageNumber;

    Book() {}

    Book(String title, String author, int yearOfPublishing, int pageNumber) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.pageNumber = pageNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book { " +
                "title: " + title +
                ", author: " + author +
                ", yearOfPublishing: " + yearOfPublishing +
                ", pageNumber: " + pageNumber +
                " }";
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}
