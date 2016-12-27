/**
 * Created by fadni on 27/12/2016.
 */

public class PhysicalNewspaperSubscription extends NewspaperSubscription {

    PhysicalNewspaperSubscription(String cus_name, String cus_add, double cus_rate)
    {
        super(cus_name,cus_add,cus_rate);
        setAddress();
    }
    public void setAddress()
    {
        if(getAddress().matches(".*\\d.*"))
        {
            rate = 15;
        }
        else
        {
            System.out.println("Invalid address");
            rate = 0;
        }
    }
}