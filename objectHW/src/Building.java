import java.util.ArrayList;

public class Building {
    int height;
    int capacity;
    String name;
    String address;
    boolean isSkyscraper=false;

    public Building(int height, String name,String address){
        this.height = height;
        this.name = name;
        this.address = address;
        if(height>1200){
            this.isSkyscraper=true;
        }
    }
}
