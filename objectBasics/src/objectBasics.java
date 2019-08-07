
public class objectBasics {

    private static void basicObjectCreator(String name,int level,String type){
        Pokemon myPokemon = new Pokemon(level,type,10,10,10);
        //creates a new Pokemon object called 'myPokemon' using the 'Pokemon' class in the Pokemon.java file that we created in the same folder as this file
        //this object allows us to access the methods that are inside of the 'Pokemon' class

        myPokemon.setName(name);  //this is referencing the setName() method of our new Pokemon object.

        //use the getName() method from the 'Pokemon' class to access the 'name' variable of our newly created Pokemon object
        System.out.println("The name of this Pokemon is " + myPokemon.getName());
        System.out.println(myPokemon.getName() + " is level " + myPokemon.getLevel());
        System.out.println(myPokemon.getName() + " is a " + myPokemon.getType() + " Type Pokemon");

        myPokemon.useMove(myPokemon.getLevel(),myPokemon.getATT(),myPokemon.getDEF());  //call the useMove() method from the Pokemon class
    }

    public static void main(String[] args){
        basicObjectCreator("Charizard",33,"Fire");
        System.out.println();

        Pokemon Jimmy = new Pokemon(100,"Dang",50,20,15);
        Jimmy.setName("Jimmy");
        Pikachu Pikachu = new Pikachu(25,100,40,50);  //we don't have to set a 'name' or 'type' for the Pikachu object, because we already did that in its Constructor

        Pikachu.takeDamage(Jimmy.useMove(Pikachu.getLevel(),Jimmy.getATT(),Pikachu.getDEF()));
        Jimmy.takeDamage(Pikachu.useMove(Jimmy.getLevel(),Pikachu.getATT(),Jimmy.getDEF()));
        //the .takeDamage method takes in an int 'damage' and the .useMove method returns an int.
        //so we pass the result of the useMove() method of the attacking Pokemon as a parameter into the takeDamage() method of the defending Pokemon
    }
}
