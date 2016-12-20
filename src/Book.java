/**
 * Created by fadni on 20/12/2016.
 */
public abstract class Book {
    String title;
    double price;

    Book(String bookTitle, double bookPrice){
        title = bookTitle;
        price = bookPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }
    abstract double setPrice();
}
