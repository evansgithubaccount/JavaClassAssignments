import java.util.Scanner;
import java.util.Random;

public class project {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        ASCIIChars.printNumbers();
        ASCIIChars.printLowerCase();
        ASCIIChars.printUpperCase();
        System.out.print("Please Enter Your Name: ");
        String name = scanner.next();
        System.out.println("Hello " + name);
        System.out.println("Would you like to continue to the interactive portion?: ");
        String response = scanner.next();

        if(response.toUpperCase().equals("YES") || response.toUpperCase().equals("Y")) {
            boolean again;
            boolean done;
            do {
                System.out.print("What is the name of your favourite pet? ");
                String pet = scanner.next();

                int petAge=0;
                do{scanner.nextLine();System.out.print("What is the age of your favourite pet? ");
                try{petAge = scanner.nextInt();done=true;}catch(Exception e){done=false;}}while(!done);

                int favNum=0;
                do{scanner.nextLine();System.out.print("What is your lucky number? ");
                try{favNum = scanner.nextInt();done=true;}catch(Exception e){done=false;}}while(!done);

                System.out.print("Do you have a favourite Quarterback? ");
                String qbResponse = scanner.next();
                int qbNum = 0;
                if (qbResponse.toUpperCase().equals("YES") || qbResponse.toUpperCase().equals("Y")) {
                    System.out.print("What is their jersey number? ");
                    qbNum = scanner.nextInt();
                }

                int carYear = 00;
                do{System.out.print("What is the two-digit model year of your car? ");
                try{carYear = scanner.nextInt();done=true;}catch(Exception e){done=false;}}while(!done);

                System.out.print("What is the first name of your favourite actor or actress? ");
                String act = scanner.next();

                int randoNum=0;
                do{System.out.print("Enter a random number between 0 and 50: ");
                try{randoNum = scanner.nextInt();done=true;}catch(Exception e){done=false;}}while(!done);

                int rand1 = rand.nextInt(65);
                int rand2 = rand.nextInt(65);
                int rand3 = rand.nextInt(65);
                int magicBall;
                if (qbNum != 0) {
                    magicBall = qbNum * rand1;
                } else {
                    magicBall = favNum * rand2;
                }
                while (magicBall > 75) {
                    magicBall -= 75;
                }

                int num1 = carYear + favNum;
                if(num1>65){num1 -= 65;}
                int num2 = 42;
                if(num2>65){num2 -= 65;}
                int num3 = act.charAt(0);
                if(num3>65){num3 -= 65;}
                int num4 = act.charAt(act.length() - 1);
                if(num4>65){num4 -= 65;}
                int num5 = qbNum + favNum + petAge;
                if(num5>65){num5 -= 65;}

                System.out.println("Lottery Numbers: " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + "  Magic Ball: " + magicBall);
                System.out.println("Would you to generate another number? ");
                String againResponse = scanner.next();
                if(againResponse.toUpperCase().equals("YES") || againResponse.toUpperCase().equals("Y")){
                    again=true;
                }else{again=false;}
            }while(again==true);
            }else{
                System.out.println("OK, BYE");
            }
        System.out.println("Aufwiedersehen");
    }
}
