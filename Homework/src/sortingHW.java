import java.util.ArrayList;
import java.util.Random;

public class sortingHW {
    private static ArrayList<Double> myList = new ArrayList<>();

    private static void selectionSort(ArrayList<Double> list){
        int listSize = list.size();

        for(int i=0;i<listSize-1;i++){
            int minIndex = i;
            for(int j=i+1;j<listSize;j++){
                if(list.get(j)<list.get(minIndex)){
                    minIndex = j;
                }
            }

            double temp = list.get(minIndex);
            list.set(minIndex,list.get(i));
            list.set(i,temp);
        }

        System.out.println(list);
    }

    private static void stupidSort(ArrayList<Double> list){
        Random rand = new Random();
        int listSize = list.size();
        double listSum=0;
        for(double i : list) listSum += i;
        double listAVG = listSum/listSize;
        for(int i=0;i<1000000;i++) {
            int rando = rand.nextInt(listSize - 2);
            double first = list.get(rando);
            double second = list.get(rando + 1);
            if (first > second) {
                list.set(rando, second);
                list.set(rando + 1, first);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args){
        for(int i=0;i<100;i++){
            myList.add(0,Math.random());
        }
        System.out.println(myList);
        stupidSort(myList);
        selectionSort(myList);
    }
}
