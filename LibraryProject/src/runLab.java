import Library.*;

public class runLab {
    static myMethods myMethods = new myMethods();

    public static void main(String[] args) {
        Library shelves = new Library("Shelves");
        GeneralBook bigBrother = new GeneralBook("1984","George Orwell","Science-Fiction",314);
        GeneralBook gatsby = new GeneralBook("The Great Gatsby","F. Scott Fitzgerald","Novel",256);
        GeneralBook wind = new GeneralBook("Gone with the Wind","Margaret Mitchell","Novel",312);
        Newspaper NYT = new Newspaper("The New York Times");

        shelves.add(bigBrother);shelves.add(gatsby);shelves.add(NYT);shelves.add(wind);

        System.out.println("Books in the Library: " + shelves.getBookList());
        System.out.println("Periodicals in the Library: " + shelves.getPeriodicalList());

        CardHolder JimmyDANG = new CardHolder("Jimmy Dang");
        shelves.addCardHolder(JimmyDANG);

        System.out.println("Jimmy has borrowed these books from the library: " + JimmyDANG.getHoldersItems());
        System.out.println();

        JimmyDANG.checkOutItem(shelves.checkOut("The Great Gatsby",JimmyDANG));

        System.out.println("Jimmy has borrowed these books from the library: " + JimmyDANG.getHoldersItems());
        System.out.println("Books in the Library: " + shelves.getBookList());
        System.out.println();

        CardHolder CBare = new CardHolder("Chris");
        shelves.addCardHolder(CBare);
        CBare.checkOutItem(shelves.checkOut("The Great Gatsby",CBare));
    }
}
