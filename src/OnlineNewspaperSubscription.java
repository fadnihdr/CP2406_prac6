/**
 * Created by fadni on 27/12/2016.
 */

public class OnlineNewspaperSubscription extends NewspaperSubscription
{
    OnlineNewspaperSubscription(String cus_name, String cus_add, double cus_rate)
    {
        super(cus_name,cus_add,cus_rate);
        setAddress();
    }
    public void setAddress()
    {
        if(getAddress().contains("@"))
        {
            rate = 9;
        }
        else
        {
            System.out.println("Invalid email address");
        }
    }
}