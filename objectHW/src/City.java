import java.util.ArrayList;

public class City {
    int Population;
    String name;
    double Area;
    int skyscraperNum;
    ArrayList<Building> cityBuildings = new ArrayList<>();

    public City(int Population, double Area, String name){
        this.Population = Population;
        this.Area = Area;
        this.name = name;
    }

    public void setPopulatoion(int population){this.Population = population;}
    public int getPopulation(){return Population;}

    public void addBuilding(Building building){
        cityBuildings.add(building);
    }

    public void meteor(){
        Population -= 1200;
        skyscraperNum -= 2;
    }
}
