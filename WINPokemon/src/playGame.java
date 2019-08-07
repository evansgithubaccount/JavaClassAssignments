import java.util.Scanner;
import java.util.Random;

public class playGame {

    int userCash = 0;
    private static int userPotions = 0;


    private static String getOpponent(){
        Random rand = new Random();
        int oppNum = rand.nextInt(3);
        String opponent;
        switch(oppNum){
            case 1: opponent = "CHARMANDER";break;
            case 2: opponent = "MEOWTH";break;
            case 3: opponent = "PIKACHU";break;
            default: opponent = "oops";break;
        }
        return opponent;
    }

    private static int getOppLevel(int userLevel){
        Random rand = new Random();
        return (userLevel-(userLevel/4)) + rand.nextInt(userLevel/2);  //generates a random number that is within 25% of the userLevel
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        pokeGUI frame = new pokeGUI();
        frame.showFrame();

        Pokemon userPoke;
        System.out.println("Choose Your Pokemon: Charmander    Meowth    Pikachu: ");
        String userChoice = scanner.next();

        switch(userChoice.toUpperCase()){
            case "CHARMANDER": userPoke = new Charmander(5);break;
            case "MEOWTH": userPoke = new Meowth(5);break;
            default: userPoke = new Pikachu(5);break;
        }
        System.out.println("Give a nickname to your " + userPoke.getName()+ "! ");
        String userNickname = scanner.next();
        userPoke.setNickname(userNickname);
        frame.setBarMax(userPoke.getmaxHP(),userPoke.getNickname(),userPoke.getLevel());
        boolean keepPlaying = true;
        int userCash = 0;
        do{
            frame.setOppBar(0);
            System.out.println(userPoke.getNickname() + " has " + userPoke.getHP() + " HP remaining.");
            System.out.println("You have $" + userCash);
            System.out.println("You have " + userPotions + " potions available.");
            if(userPotions > 0){
                System.out.println("Would you like to use a potion? ");
                String potionResponse = scanner.next();
                if(potionResponse.toUpperCase().equals("Y") || potionResponse.toUpperCase().equals("YES")){
                    double initialHP = userPoke.getHP();
                    double maxHP = userPoke.getmaxHP();
                    userPoke.setHP((initialHP + 20));
                    if(userPoke.getHP()>maxHP){
                        userPoke.setHP(maxHP);
                    }
                    int potionInt = (int) userPoke.getHP();
                    frame.updateHPBar(potionInt,userPoke.getHP());
                    double deltaHP = userPoke.getHP()-initialHP;
                    System.out.println(userPoke.getNickname() + " gained " + deltaHP + " HP");
                    userPotions -= 1;
                }
            }
            System.out.println("Choose destination: Tall Grass(g) or PokeMart(p)? ");
            String userResponse = scanner.next();
            if(userResponse.toUpperCase().equals("G")){
                Random rand = new Random();
                String opp = getOpponent();
                int oppLevel = getOppLevel(userPoke.getLevel());
                Pokemon wildPokemon;
                switch(opp){
                    case "CHARMANDER": wildPokemon = new Charmander(oppLevel);break;
                    case "MEOWTH": wildPokemon = new Meowth(oppLevel);break;
                    default: wildPokemon = new Pikachu(oppLevel);break;
                }
                frame.showOppBar(wildPokemon.getmaxHP(),wildPokemon.getName());
                frame.OPPsetStringPainted(true);
                System.out.println("A wild " + wildPokemon.getName() + " appeared!");
                System.out.println("The wild " + wildPokemon.getName() + " is Level " + wildPokemon.getLevel());
                do{
                    System.out.println("Choose a move...");
                    System.out.println(userPoke.getMove(0) + "(1), " + userPoke.getMove(1) + "(2)?: ");
                    int userMove = scanner.nextInt();
                    switch (userMove) {
                        case 1:
                            wildPokemon.takeDamage(userPoke.move1(wildPokemon.getDEF(), wildPokemon.getType()),true);
                            break;
                        case 2:
                            wildPokemon.takeDamage(userPoke.move2(wildPokemon.getDEF(),wildPokemon.getType()),true);
                            break;
                        default:
                            System.out.println("Invalid Character");
                    }
                    int oppInt = (int) wildPokemon.getHP();
                    frame.updateOppHP(oppInt,wildPokemon.getHP());
                    if(wildPokemon.getHP()<=0){break;}
                    System.out.println(" ");
                    int wildMoveChoice = rand.nextInt(2);
                    switch(wildMoveChoice){
                        case 0: userPoke.takeDamage(wildPokemon.move1(userPoke.getDEF(),userPoke.getType()),false);break;
                        case 1: userPoke.takeDamage(wildPokemon.move2(userPoke.getDEF(),userPoke.getType()),false);break;
                        default:
                            System.out.println(wildPokemon.getName() + " flinched!");
                    }
                    int hpInt = (int) userPoke.getHP();
                    frame.updateHPBar(hpInt,userPoke.getHP());
                }while(userPoke.getHP()>0 && wildPokemon.getHP()>0);
                if(wildPokemon.getHP()<=0){
                    System.out.println("You were awarded $100");
                    userCash += 100;
                    System.out.println(userPoke.getNickname() + " gained 50 XP");
                    userPoke.addXP(50);
                    if(userPoke.getXP()>150){
                        userPoke.setLevel(userPoke.getLevel() + 1);
                        System.out.println(userPoke.getNickname() + " grew to Level " + userPoke.getLevel());
                        userPoke.setXP(0);
                        frame.setUserLevel(userPoke.getLevel(),userPoke.getNickname());
                    }
                }
                frame.hideOppBar();
                System.out.println(" ");
            }else if(userResponse.toUpperCase().equals("P")){
                System.out.println("Would you like to purchase a potion? ");
                String purchaseResponse = scanner.next();
                if(purchaseResponse.toUpperCase().equals("Y") || purchaseResponse.toUpperCase().equals("YES")){
                    if(userCash < 100){
                        System.out.println("You don't have enough money to buy a potion");
                    }else{
                        userPotions += 1;
                        System.out.println("Potion purchased");
                        userCash -= 100;
                    }
                }
            }else{keepPlaying = false;}
        }while(keepPlaying);
    }
}
