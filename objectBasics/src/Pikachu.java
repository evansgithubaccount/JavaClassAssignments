
class Pikachu extends Pokemon{  //the 'extends' keyword gives the Pikachu class access to the variables and methods in the Pokemon class
    //extends also means that any Pikachu object that we create will have all of the properties of a Pokemon object

    //this means that 'Pikachu' is a sub-class of 'Pokemon'
    public Pikachu(int level,int HP,int ATT,int DEF){
        super(level,"Electric",HP,ATT,DEF);  //super calls the constructor of the parent-class. So in this case it calls the Constructor of the 'Pokemon' class
        this.name = "Pikachu";
    }
}