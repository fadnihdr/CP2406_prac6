/**
 * Created by fadni on 20/12/2016.
 */
public abstract class NewspaperSubscription {
    private String name;
    protected String address;
    protected double rate;

    NewspaperSubscription(String cus_name, String cus_add, double cus_rate)
    {
        name = cus_name;
        address = cus_add;
        rate = cus_rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }

    public abstract void setAddress();

}