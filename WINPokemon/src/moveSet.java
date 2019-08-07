import java.util.ArrayList;
import java.util.List;

public class moveSet {
    private List<String> moves = new ArrayList<>();
    private List<Double> moveStrengths = new ArrayList<>();
    private double pokeATT;
    private String pokeName;
    private String nickname;
    private int level;

    public moveSet(String pokeName,int pokeLevel,double ATT){
        this.pokeName = pokeName;
        this.level = pokeLevel;
        this.pokeATT = ATT;
    }

    public void setMoves(String move){
        this.moves.add(move);  //.add allows us to add elements to the Array List 'moveSet' that we created at the top
    }
    public String getMove(int index){return this.moves.get(index);}

    public void setMoveStrengths(double moveStrength){
        this.moveStrengths.add(moveStrength);  //.add allows us to add elements to the Array List 'moveSet' that we created at the top
    }
    public double getMoveStrengths(int index){return this.moveStrengths.get(index);}

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public double move1(double oppDEF,String oppType){
        Move move1 = new Move(level,moveStrengths.get(0),pokeATT,oppDEF,moves.get(0),pokeName,nickname);
        double damage = move1.doMove();  //every Move is an object with its own methods
        return damage;
    }

    public double move2(double oppDEF,String oppType){
        Move move2 = new Move(level,moveStrengths.get(1),pokeATT,oppDEF,moves.get(1),pokeName,nickname);
        double damage = move2.doMove();
        return damage;
    }
}
