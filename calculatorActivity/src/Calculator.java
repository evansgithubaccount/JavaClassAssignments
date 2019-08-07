import java.util.Scanner;

public class Calculator {

    public Calculator(){

    }

    public double add(double firstNum, double secondNum){
        return firstNum + secondNum;
    }

    public double subtract(double firstNum, double secondNum){
        return firstNum-secondNum;
    }

    public double multiply(double firstNum, double secondNum){
        return firstNum*secondNum;
    }

    public double divide(double firstNum, double secondNum){
        return firstNum/secondNum;
    }

    public void runCalc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is a calculator");
        boolean doIt = true;
        do {
            System.out.println("Would you like to Add (A), Subtract (S), Multiply (M), or Divide (D)");
            String response = scanner.next();

            switch(response.toUpperCase()){
                case "QUIT" : doIt = false;break;
                case "A" : {System.out.println("Addition Selected");
                    System.out.println("Enter the two numbers that you would like to add: ");
                    double first = scanner.nextDouble();
                    double second = scanner.nextDouble();
                    System.out.println(first + " + " + second + " = " + add(first, second));
                    System.out.println();break;}
                case "S" : {System.out.println("Subtraction Selected");
                    System.out.println("Enter a number and the number that you would like to subtract from it: ");
                    double first = scanner.nextDouble();
                    double second = scanner.nextDouble();
                    System.out.println(first + " - " + second + " = " + subtract(first, second));
                    System.out.println();break;}
                case "M" : {System.out.println("Multiplication Selected");
                    System.out.println("Enter the two numbers that you would like to multiply: ");
                    double first = scanner.nextDouble();
                    double second = scanner.nextDouble();
                    System.out.println(first + " x " + second + " = " + multiply(first, second));
                    System.out.println();break;}
                case "D" : {System.out.println("Division Selected");
                    System.out.println("Enter the two numbers that you would like to divide: ");
                    double first = scanner.nextDouble();
                    double second = scanner.nextDouble();
                    System.out.println(first + " / " + second + " = " + divide(first, second));
                    System.out.println();break;}
                default: doIt = true;break;
            }
        }while(doIt);
    }
}
