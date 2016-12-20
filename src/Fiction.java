/**
 * Created by fadni on 20/12/2016.
 */
public abstract class Fiction extends Book {

    Fiction(String bookTitle, double bookPrice)
    {
        super(bookTitle,bookPrice);

    }
    public double setPrice() {
        this.price = 24.99;
        return price;
    }

}


