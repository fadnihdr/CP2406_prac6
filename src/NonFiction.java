/**
 * Created by fadni on 20/12/2016.
 */
public abstract class NonFiction extends Book {

    NonFiction(String bookTitle, double bookPrice)
    {
        super(bookTitle,bookPrice);

    }
    public double setPrice() {
        this.price = 37.99;
        return price;
    }

}