package store;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.time.*;
import java.util.ArrayList;

public class SandwichShop {
    String name;
    String address;
    boolean open;
    LocalTime openingTime;
    LocalTime closingTime;
    ArrayList<String> sandwichSelection;

    public SandwichShop(String name){
        this.name = name;
        sandwichSelection = new ArrayList<>();
        loadSandwiches();
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public String getAddress(){return address;}
    public void setAddress(String address){this.address = address;}

    public boolean getOpen(){return open;}
    public void setOpen(boolean open){this.open = open;}

    public ArrayList getSandwiches(){return sandwichSelection;}

    private void loadSandwiches(){
        try {
            Utils.loadSandwiches(this.sandwichSelection);
        }catch(IOException e){
            System.out.println("Could not load the sandwiches");
            this.sandwichSelection = new ArrayList<String>();
        }
    }

    public void addSandwich(String sandwich){
        sandwichSelection.add(sandwich);
    }

    public void addSandwichToOrigin(String sandwich){
        try(FileWriter fw = new FileWriter("Sandwiches.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(sandwich);
        }catch(IOException e){
            System.out.println("failed to add sandwich");
        }
        loadSandwiches();
    }

    public void sandwichSearch(String sandwichName){
        boolean hasSandwich = sandwichSelection.contains(sandwichName);
        if(hasSandwich){
            System.out.println("We do have " + sandwichName + " on our menu! That'll be $680");
        }else{
            System.out.println("We don't have that. Go somewhere else.");
        }
    }
}
