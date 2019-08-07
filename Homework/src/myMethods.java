import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;
import java.util.Stack;

public class myMethods {

    public myMethods(){

    }

    public String getStringInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);

        String newString = scanner.nextLine();
        return newString;
    }

    public int getIntInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);

        int newInt = scanner.nextInt();
        return newInt;
    }

    public double getDubInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);

        double newDub = scanner.nextDouble();
        return newDub;
    }

    public int roundDubToInt(double dub){
        long newLong = Math.round(dub);
        return ((int) (long) newLong);
    }

    public double roundDouble(double dub,int decimalPlaces){
        MathContext m = new MathContext(decimalPlaces + 1);
        BigDecimal bigDub = new BigDecimal(dub);
        bigDub = bigDub.round(m);
        return bigDub.doubleValue();
    }

    public Stack intArrToStack(int[] intArr){
        Stack<Integer> stack = new Stack<>();
        for(Integer i : intArr){
            stack.push(i);
        }
        return stack;
    }

    public Stack stringArrToStack(String[] stringArr){
        Stack<String> stack = new Stack<>();
        for(String i : stringArr){
            stack.push(i);
        }
        return stack;
    }

    public Stack doubleArrToStack(Double[] doubleArr){
        Stack<Double> stack = new Stack<>();
        for(Double i : doubleArr){
            stack.push(i);
        }
        return stack;
    }
}
