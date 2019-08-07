import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.math.MathContext;

public class Pokemon {
    private int level;  //private means that they can only be used inside of a Pokemon object
    private boolean caught;
    private String type;
    private String name;
    private String nickname;
    private int XP=0;
    private double HP;
    private int maxHP;
    private double ATT;
    private double DEF;
    private moveSet MoveSet;


    public Pokemon(){  //this is the Constructor. Constructors are called when an object of a class is created

    }

    public String getNickname(){return this.nickname;}
    public void setNickname(String nickname){
        this.nickname=nickname;
        MoveSet.setNickname(nickname);
    }

    public String getName(){  //we will use this to access the name variable when in other objects
        return name;
    }
    public void setName(String name){  //get and set aren't static, because static methods belong to the class, and not the object
        this.name = name;
    }

    public void initMoves(){
        MoveSet = new moveSet(this.name,this.level,this.ATT);
    }

    public int getLevel(){  //getter allows other objects see the level variable
        return level;
    }
    //GETTERS AND SETTERS ARE NOT STATIC
    public void setLevel(int level){  //setter allows us to set the value from another object
        this.level = level;  //this.legs refers to the variable declared at the top
    }

    public boolean getCaught(){
        return caught;
    }
    public void setCaught(boolean caught){
        this.caught = caught;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public void setHP(double HP){this.HP = HP;}
    public double getHP(){return HP;}

    public void setmaxHP(int HP){this.maxHP = HP;}
    public int getmaxHP(){return maxHP;}

    public void setATT(double ATT){this.ATT = ATT;}
    public double getATT(){return ATT;}

    public void setDEF(double DEF){this.DEF = DEF;}
    public double getDEF(){return DEF;}

    public void setXP(int XP){this.XP = XP;}
    public void addXP(int addedXP){this.XP += addedXP;}
    public int getXP(){return this.XP;}

    public void takeDamage(double damage,boolean wild){
        this.HP -= damage;
        MathContext m = new MathContext(3);  //MathContext lets us set the precision to which we will round
        BigDecimal bigHP = new BigDecimal(this.HP);  //BigDecimal is an object that holds a value that we can round later on
        bigHP = bigHP.round(m);  //we round the BigDecimal to a precision of 3
        this.HP = bigHP.doubleValue();  //doubleValue() turns a BigDecimal into a double
        if(this.nickname != null){
            System.out.println(this.nickname + " took " + damage + " damage");
        }else {
            System.out.println(this.name + " took " + damage + " damage");
        }
        if(this.HP <= 0){
            if(wild == true) {
                System.out.println("The wild " + this.name + " fainted");
            }else{
                System.out.println(this.name + " fainted");
            }
        }else if(this.nickname != null){
            System.out.println(this.nickname + " has " + this.HP + " HP remaining");
        }else{
            System.out.println(this.name + " has " + this.HP + " HP remaining");
        }
    }

    public void setMoveSet(String move){
        MoveSet.setMoves(move);  //.add allows us to add elements to the Array List 'moveSet' that we created at the top
    }
    public String getMove(int index){return MoveSet.getMove(index);}

    public void setMoveStrengths(double moveStrength){
        this.MoveSet.setMoveStrengths(moveStrength);  //.add allows us to add elements to the Array List 'moveSet' that we created at the top
    }
    public double getMoveStrengths(int index){return MoveSet.getMoveStrengths(index);}

    public double move1(double oppDEF,String oppType){
        double damage = MoveSet.move1(oppDEF,oppType);
        return damage;
    }

    public double move2(double oppDEF,String oppType){
        double damage = MoveSet.move2(oppDEF,oppType);
        return damage;
    }
}

class Move {
    private double pwrLevel;
    private double damage;
    private String moveName;
    private String pokeName;
    private String nickname;

    public Move(int pwrLevel,double strength,double ATT,double DEF,String moveName,String pokeName,String nickname){
        this.moveName = moveName;
        this.pokeName = pokeName;
        this.nickname = nickname;
        this.pwrLevel = pwrLevel;
        this.damage = ((2*this.pwrLevel/5+2)*strength*(ATT/DEF))/40;
    }

    public double doMove(){
        if(this.nickname != null){
            System.out.println(String.format("%s used %s",this.nickname,this.moveName));
        }else {
            System.out.println(String.format("%s used %s", this.pokeName, this.moveName));
        }
        BigDecimal finalDamage = new BigDecimal(this.damage);
        MathContext m = new MathContext(3);
        BigDecimal roundedDamage = finalDamage.round(m);
        this.damage = roundedDamage.doubleValue();
        return this.damage;
    }
}


