package store;


import java.io.IOException;
import java.util.ArrayList;

public class Bookstore extends store{
    private boolean hasUsed;
    private boolean openWeekends;
    private boolean openSundays;
    private ArrayList<String> titles;

    public Bookstore(String name){
        super(name);
        titles = new ArrayList<String>();
        loadTitles();
    }

    public boolean getHasUsed(){return hasUsed;}
    public void setHasUsed(boolean hasUsed){this.hasUsed = hasUsed;}


    public boolean getOpenWeekends(){return openWeekends;}
    public void setOpenWeekends(boolean openWeekends){this.openWeekends=openWeekends;}

    public boolean getOpenSundays(){return openSundays;}
    public void setOpenSundays(boolean openSundays){this.openSundays=openSundays;}


    public ArrayList getTitles(){return titles;}

    public void addBood(String title){
        titles.add(title);
    }

    private void loadTitles(){
        try {
            Utils.loadBooks(this.titles);
        }catch(IOException e){
            System.out.println("Could not load the titles");
            this.titles = new ArrayList<String>();
        }
    }

}
