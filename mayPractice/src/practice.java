import javax.swing.*;
import java.util.Scanner;

public class practice {

    public static void playPokemon(){
        Scanner newStarter = new Scanner(System.in);
        System.out.println("There are three pokeballs in front of you...");
        System.out.println("1.Charmander   2.Bulbasaur   3.Squirtle");
        int starterSelect = newStarter.nextInt();
        Pokemon starter = new Pokemon();
        switch(starterSelect){
            case 1: starter.setName("Charmander");starter.setLevel(5);starter.setType("Fire");break;
            case 2: starter.setName("Bulbasaur");starter.setLevel(5);starter.setType("Grass");break;
            case 3: starter.setName("Squirtle");starter.setLevel(5);starter.setType("Water");break;
            default: System.out.println("Fatality. You lose.");break;
        }
        System.out.println("User selected " + starter.getName() + " as their starter Pokemon");
    }

    public static void main(String[] args){
        playPokemon();
    }

}
