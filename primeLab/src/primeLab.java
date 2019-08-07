public class primeLab {
    public static boolean isPrime(int n){
        boolean prime = true;
        for(int i=2;i<n/2+1;i++){
            if(n%i == 0){
                prime = false;
                break;
            }
        }return prime;
    }
    public static void main(String[] args){
        System.out.println(isPrime(4346936));
        for(int i = 1;i<100;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
