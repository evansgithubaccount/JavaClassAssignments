import java.util.Stack;

public class hanoi {
    Stack<Integer> tower1 = new Stack<>();
    Stack<Integer> tower2 = new Stack<>();
    Stack<Integer> tower3 = new Stack<>();
    public static void move(int n,Stack<Integer> firstT,Stack<Integer> secondT,Stack<Integer> thirdT){
        for(int i=0;i<n;i++){
            firstT.push(n-i);
        }
        thirdT.push(firstT.pop());

    }
}
