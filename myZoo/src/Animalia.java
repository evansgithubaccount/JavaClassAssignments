abstract class Animalia {
    String name;

    public Animalia(){

    }

    public void makeNoise(){
        System.out.println(name + " made a sound!");
    }
    public void move(int distance){
        System.out.println(name + " moved " + distance + " meters");
    }
}
