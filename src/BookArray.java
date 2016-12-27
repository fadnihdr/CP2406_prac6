/**
 * Created by fadni on 27/12/2016.
 */
public class BookArray {

    public static void main(String[] args) {

        Book someBook[] = new Book[10];
        int x;
        someBook[0] = new Fiction("Animal Farm");

        someBook[1] = new NonFiction("In Cold Blood");

        someBook[2] = new Fiction("1984");

        someBook[3] = new NonFiction("The Diary of a Young Girl");

        someBook[4] = new Fiction("The Man in the High Castle");

        someBook[5] = new NonFiction("Mein Kampf");

        someBook[6] = new Fiction("To Kill A Mockingbird");

        someBook[7] = new Fiction("A Game of Thrones");

        someBook[8] = new Fiction("Ready Player One");

        someBook[9] = new Fiction("The Hobbit");


        for(x = 0; x < someBook.length; ++x)
            System.out.println("Book: " + someBook[x].getTitle() + " costs $" + someBook[x].getPrice());
    }

}