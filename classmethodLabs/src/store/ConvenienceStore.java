package store;

import java.time.LocalTime;

public class ConvenienceStore extends store{
    private double avgPrice;

    public ConvenienceStore(String name, double avgPrice){
        super(name);
        this.avgPrice = avgPrice;
    }

    public double getAvgPrice(){return avgPrice;}
    public void setAvgPrice(double avgPrice){this.avgPrice = avgPrice;}
}
