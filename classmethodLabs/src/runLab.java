import store.Bookstore;
import store.CoffeeShop;
import store.SandwichShop;

import java.time.*;
import java.util.Scanner;

public class runLab {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Bookstore Library = new Bookstore("Library");
        CoffeeShop burntBeans = new CoffeeShop("Burnt Beans",true);
        SandwichShop sandStore = new SandwichShop("Disappointing Sandwiches");

        Library.setAddress("1 Book Ave");
        Library.setHasUsed(true);
        Library.setOpen(true);

        sandStore.addSandwich("Jamburger");

        System.out.print("What kind of sandwich would you like to buy today?:  ");
        String userSand = scanner.next();
        sandStore.sandwichSearch(userSand);

        System.out.println();
        System.out.println("Sandwich List: " + sandStore.getSandwiches());
    }
}
