package store;

import java.time.LocalTime;


public class CoffeeShop extends store{
    private boolean hasWifi;

    public CoffeeShop(String name, boolean hasWifi){
        super(name);
        this.hasWifi = hasWifi;
    }

    public boolean getHasWifi(){return hasWifi;}
    public void setHasWifi(boolean hasWifi){this.hasWifi = hasWifi;}

}
