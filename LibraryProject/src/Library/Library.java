package Library;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private String name;
    private ArrayList<LibraryItem> libraryItems;
    private ArrayList<Book> libraryBooks;
    private ArrayList<Periodical> libraryPeriodicals;
    private ArrayList<LibraryItem> checkedOut;
    private ArrayList<Book> booksOut;
    private ArrayList<Periodical> periodicalsOut;
    private ArrayList<CardHolder> cardHolders;
    private HashMap<String,String> loanedTo;

    public Library(String name){
        this.name = name;
        libraryItems = new ArrayList<>();
        libraryBooks = new ArrayList<>();
        libraryPeriodicals = new ArrayList<>();
        checkedOut = new ArrayList<>();
        booksOut = new ArrayList<>();
        periodicalsOut = new ArrayList<>();
        cardHolders = new ArrayList<>();
        loanedTo = new HashMap<>();
    }

    public String getName(){return name;}

    public void addCardHolder(CardHolder ch){cardHolders.add(ch);}
    public ArrayList getCardHolders(){
        ArrayList<String> names = new ArrayList<>();
        for(CardHolder c : cardHolders){
            names.add(c.getName());
        }
        return names;
    }

    public void add(LibraryItem item){
        libraryItems.add(item);
        if(item.getType().equals("book")){
            Book bItem = (Book) item;
            addBook(bItem);
        }else if(item.getType().equals("periodical")){
            Periodical pItem = (Periodical) item;
            addPeriodical(pItem);
        }else{
            System.out.println("Unknown Item Type. Addition to Library.Library Failed");
        }
    }

    public ArrayList getItems(){return libraryItems;}
    public ArrayList getBooks(){return libraryBooks;}
    public ArrayList getPeriodicals(){return libraryPeriodicals;}

    public ArrayList getBookList(){
        ArrayList<String> books = new ArrayList<>();
        for(Book b : libraryBooks){
            books.add(b.getName());
        }
        return books;
    }

    public ArrayList getPeriodicalList(){
        ArrayList<String> periodicals = new ArrayList<>();
        for(Periodical p : libraryPeriodicals){
            periodicals.add(p.getName());
        }
        return periodicals;
    }

    public LibraryItem checkOut(String name,CardHolder ch){
        LibraryItem thisItem;
        if(!cardHolders.contains(ch)){
            System.out.println("You are not a card holder.");
            return null;
        }

        for(LibraryItem i : checkedOut){
            if(i.getName().equals(name)){
                System.out.println("Sorry, that " + i.getType() + " is currently loaned out to " + loanedTo.get(name));
                return null;
            }
        }

        for(LibraryItem i : libraryItems){
            if(i.getName().equals(name)){
                thisItem = i;
                checkedOut.add(i);
                loanedTo.put(i.getName(),ch.getName());
                libraryItems.remove(i);
                if(i.getType().equals("book")){libraryBooks.remove(i);booksOut.add(i.toBook());}
                else if(i.getType().equals("periodical")){libraryPeriodicals.remove(i);periodicalsOut.add(i.toPeriodical());}
                return thisItem;
            }
        }
        System.out.println("The Library doesn't have that.");
        return null;
    }

    public ArrayList getItemsOut(){
        ArrayList<String> itemNames = new ArrayList<>();
        for(LibraryItem i : checkedOut){
            itemNames.add(i.getName());
        }
        return itemNames;
    }

    public ArrayList getBooksOut(){
        ArrayList<String> bookNames = new ArrayList<>();
        for(Book b : booksOut){
            bookNames.add(b.getName());
        }
        return bookNames;
    }

    public ArrayList getPOut(){
        ArrayList<String> pNames = new ArrayList<>();
        for(Periodical p : periodicalsOut){
            pNames.add(p.getName());
        }
        return pNames;
    }

    private void addBook(Book book){libraryBooks.add(book);}
    private void addPeriodical(Periodical periodical){libraryPeriodicals.add(periodical);}
}
