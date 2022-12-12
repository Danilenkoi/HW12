import javax.xml.namespace.QName;

public class Book {

    private int year;
    private String title;

    public Book(int year, String title) {
        this.year = year;
        this.title = title;
    }
    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }


}
