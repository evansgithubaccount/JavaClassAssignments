package store;

import java.time.LocalTime;

abstract class store {
    private String name;
    private String address;
    private double sqft;
    private boolean open;
    private LocalTime openingTime;
    private LocalTime closingTime;

    public store(String name){
        this.name = name;
    }

    public String getName(){return this.name;}
    public void setName(String name){this.name=name;}

    public String getAddress(){return this.address;}
    public void setAddress(String address){this.address = address;}

    public double getSqft(){return this.sqft;}
    public void setSqft(double sqft){this.sqft = sqft;}

    public boolean getOpen(){return this.open;}
    public void setOpen(boolean open){this.open = open;}

    public LocalTime getOpeningTime(){return this.openingTime;}
    public void setOpeningTime(LocalTime openingTime){this.openingTime = openingTime;}

    public LocalTime getClosingTime(){return this.closingTime;}
    public void setClosingTime(LocalTime closingTime){this.closingTime = closingTime;}
}
