package Library;

import java.util.ArrayList;

public class CardHolder {
    String name;
    String address;
    private ArrayList<LibraryItem> checkedItems;

    public CardHolder(String name){
        this.name = name;
        checkedItems = new ArrayList<>();
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public void checkOutItem(LibraryItem item){
        if(item!=null){
            checkedItems.add(item);
            System.out.println(name + " checked out " + item.getName());
        }
    }

    public ArrayList getHoldersItems(){
        ArrayList<String> items = new ArrayList<>();
        for(LibraryItem i : checkedItems){
            items.add(i.getName());
        }
        return items;
    }


}
