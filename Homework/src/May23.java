import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class May23 {

    private static myMethods stuff = new myMethods();

    public static void arrList(){
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Elephant");
        animals.add("Albatross");
        animals.add("Salamander");
        animals.add("Poison Dart Frog");

        animals.forEach(animal -> System.out.println(animal));

        String favAnimal = "Elephant";
        if(animals.contains(favAnimal)){
            System.out.println("I love " + favAnimal + "s");
        }else {
            System.out.println("I don't care for those.");
        }
    }

    public static void hashMaps(){
        HashMap<String,String> hmap = new HashMap<>();

        String name = stuff.getStringInput("Enter Name");
        String age = stuff.getStringInput("Enter Age");
        String home = stuff.getStringInput("Enter Hometown");
        String food = stuff.getStringInput("Enter Favourite Food");

        hmap.put("Name",name);
        hmap.put("Age",age);
        hmap.put("Hometown",home);
        hmap.put("Favourite Food",food);

        System.out.println("This is " + hmap.get("Name"));
        System.out.println("They are " + hmap.get("Age") + "-years-old");
        System.out.println("from " + hmap.get("Hometown"));
        System.out.println("and their favourite food is " + hmap.get("Favourite Food"));
    }

    public static void moreForEach(){
        ArrayList<Integer> myInts = new ArrayList<>();
        myInts.add(stuff.getIntInput("Enter first number"));
        myInts.add(stuff.getIntInput("Enter second number"));
        myInts.add(stuff.getIntInput("Enter third number"));
        myInts.add(stuff.getIntInput("Enter fourth number"));
        myInts.add(stuff.getIntInput("Enter fifth number"));
        int addInts=0;
        for (Integer i : myInts) {
           addInts += i;
        }System.out.println("The sum of the integers is " + addInts);
        int product = 1;
        for(Integer i : myInts){
            product *= i;
        }System.out.println("The product of the numbers is " + product);
        System.out.println("The largest number is " + Collections.max(myInts));
        System.out.println("The smallest number is " + Collections.min(myInts));
    }

    static void moreHMaps(){
        HashMap<String,String> cars = new HashMap<>();
        cars.put("Crosstrek","Subaru");
        cars.put("Highlander","Toyota");
        cars.put("R8","Audi");
        String model = stuff.getStringInput("What car model are you looking for?");
        if(cars.containsKey(model)){
            System.out.println("Oh you're looking for a " + model + "? Our " + cars.get(model) + " selection is right over here");
        }else{System.out.println("We don't have that model. Now get out.");}
    }

    public static void main(String[] args){
        moreForEach();
    }
}
