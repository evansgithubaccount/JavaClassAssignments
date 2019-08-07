import java.util.Scanner;

public class lab1 {

    public static String username;
    public static int age;
    public static String employment;
    public static String car;

    public static void step1(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        username = scanner.next();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.println(String.format("Hello %s, your age is %d", username, age));

        System.out.println(age>16 ? "You are old enough to drive":"You aren't old enough to drive");
        System.out.println(age>18 ? "You are old enough to vote":"You aren't old enough to vote");
        System.out.println(age>21 ? "You are old enough to drink":"You aren't old enough to drink");
        System.out.println(age>35 ? "You are old enough to be President":"You aren't old enough to be President");
        System.out.println(age>55 ? "You can join AARP":"You aren't old enough to join AARP");
        System.out.println(age>67 ? "You can start drawing Social Security":"You aren't old enough to start drawing Social Security");
    }

    public static void step2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employment Status (E,U,S): ");
        employment = scanner.next();
        System.out.print("Do you have a car(C), truck(T), suv(S), or do not own a vehicle(N)?: ");
        car = scanner.next();

        switch(employment){
            case "E": System.out.println("You are employed");break;
            case "U": System.out.println("You are unemployed");break;
            case "S": System.out.println("You are a student");break;
            default: System.out.println("Invalid Character Entered");break;
        }

        switch(car){
            case "C": System.out.println("You have a car");break;
            case "T": System.out.println("You have a truck");break;
            case "S": System.out.println("You have an SUV");break;
            case "N": System.out.println("You don't have a car");break;
            default: System.out.println("Invalid Character Entered");break;
        }
    }

    public static void step3(){
        int[] myArray = new int[30];
        for(int i=0;i<myArray.length;i++){
            myArray[i] = i;
        }
        for(int i=0;i<myArray.length;){
            myArray[i] = 2*(++i);
        }
        for(int i : myArray){
            System.out.println(i);
        }
        for(int i=0;i<myArray.length;i++){
            System.out.println(myArray[29-i]);
        }
    }

    public static void step4(){
        int[] myArray = new int[30];
        for(int i=0;i<myArray.length;){ myArray[i] = 2*(++i);}
        int i=0;
        while(i<myArray.length){System.out.println(myArray[i]);i++;}
        boolean repeat=false;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your name: ");
            username = scanner.next();

            System.out.print("Enter your age: ");
            age = scanner.nextInt();

            System.out.println(String.format("Hello %s, your age is %d", username, age));

            System.out.println(age>16 ? "You are old enough to drive":"You aren't old enough to drive");
            System.out.println(age>18 ? "You are old enough to vote":"You aren't old enough to vote");
            System.out.println(age>21 ? "You are old enough to drink":"You aren't old enough to drink");
            System.out.println(age>35 ? "You are old enough to be President":"You aren't old enough to be President");
            System.out.println(age>55 ? "You can join AARP":"You aren't old enough to join AARP");
            System.out.println(age>67 ? "You can start drawing Social Security":"You aren't old enough to start drawing Social Security");
            System.out.print("Do you want to answer the questions again? Y/N: ");
            String again = scanner.next();
            switch(again.toUpperCase()){
                case "y": repeat = true;break;
                default: repeat = false;break;
            }
        }while(repeat==true);
    }

    public static int step5(int boom){
        int[] myArray = new int[30];
        int total = 0;
        for(int i=0;i<myArray.length;){ myArray[i] = 2*(++i);}
        for(int i : myArray){
            if(i%2 != 0){
                System.out.println(i);
            }else{
                total += i;
            }
            if(i == boom){break;}
            }
        System.out.println("Final total: " + total);
        return total;
    }

    public static void main(String[] args){
        step5(7);
    }
}
