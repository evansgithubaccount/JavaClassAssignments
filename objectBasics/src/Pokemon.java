
public class Pokemon {  //this class 'Pokemon' can be used later to create a 'Pokemon' object

    //this class is essentially creating a template for what a 'Pokemon' object is

    //this will give every Pokemon object its own 'name','level','type','HP','ATT',and 'DEF' variables;
    String name;
    int level;
    String type;
    int HP;
    int ATT;
    int DEF;


    //CONSTRUCTOR - must have the same name as the class
    public Pokemon(int level,String type,int HP,int ATT,int DEF){ //this is the constructor, it runs when we create a new Pokemon object
        //this is where we can set all of the initial values for our Object
        this.level = level;
        this.type = type;
        this.HP = HP;
        this.ATT = ATT;
        this.DEF = DEF;
        //we use 'this.level' and 'this.type' in order to distinguish...
        //...between the 'level' variable of the Pokemon object and the parameter 'level' that we're taking in
    }


    //GETTERS AND SETTERS - (getters and setters cannot be static or private)
    public String getName(){return this.name;}
    //this is a 'getter' method. It will allow us to access the 'name' variable of any Pokemon object that we create in other files.

    public void setName(String name){this.name = name;}
    //this is a 'setter' method. It will allow us to assign a value to the 'name' variable after we create a Pokemon object.

    public int getLevel(){return level;}
    public void setLevel(int level){this.level=level;}

    public int getHP(){return HP;}
    public int getATT(){return ATT;}
    public int getDEF(){return DEF;}

    public String getType(){return type;}
    public void setType(String type){this.type = type;}


    //any non-private method that we create in this Pokemon class can be called on later when we create a new Pokemon object
    public int useMove(int strength,int ATT,int DEF){

        int damage = ((2*this.level/5+2)*strength*(ATT/DEF))/40;  //calculates the damage that the move does

        switch(this.type.toUpperCase()){  //checks the 'type' variable of the Pokemon object
            //outputs different things depending on the 'type' of the Pokemon object
            case "WATER": System.out.println(name + " used Water Gun!");break;

            case "GRASS": System.out.println(name + " used Vine Wip!");break;

            case "FIRE": System.out.println(name + " used Ember!");break;

            case "ELECTRIC": System.out.println(name + " used Thunderbolt!");break;

            case "DANG": System.out.println(name + " used Sarcasm!");System.out.println("...it's not very effective");break;

            default: System.out.println(name + " used Tackle!");break;
        }
        if(this.type.equals("Dang")){  //Jimmy Dang
            return 1;
        }
        return damage;  //returns the damage
    }


    public void takeDamage(int damage) {
        System.out.println(this.name + " took " + damage + " damage");
        this.HP -= damage;
        if (this.HP <= 0) {
            System.out.println(this.name + " fainted.");
        } else{
            System.out.println(this.name + " has " + this.HP + " HP remaining");
            System.out.println();
        }
    }
}


