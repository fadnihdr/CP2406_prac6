/**
 * Created by fadni on 27/12/2016.
 */
public class DemoSubcription {
    public static void main(String[] args)
    {
        NewspaperSubscription man1 = new PhysicalNewspaperSubscription("sub1","AAAAA",30);
        NewspaperSubscription man2 = new PhysicalNewspaperSubscription("sub2","BBBBB",20);
        NewspaperSubscription man3 = new OnlineNewspaperSubscription("sub3","@CCCCC",40);
        NewspaperSubscription man4 = new OnlineNewspaperSubscription("sub4","DDDDD",10);
        System.out.println(man1.getRate());
        System.out.println(man2.getRate());
        System.out.println(man3.getRate());
        System.out.println(man4.getRate());
    }
}
