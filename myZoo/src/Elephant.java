public class Elephant extends Animalia{
    int height;

    public Elephant(String name){
        this.name = name;
    }

    @Override
    public void makeNoise(){
        System.out.println(name + " trumpeted loudly!");
    }
}
