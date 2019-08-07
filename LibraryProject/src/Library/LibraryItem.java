package Library;

abstract class LibraryItem {
    String name;
    boolean availablity;
    String type;

    public LibraryItem(String name){
        this.name = name;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public void setAvailablity(boolean availability){this.availablity = availability;}
    public boolean getAvailability(){return availablity;}

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    public Book toBook(){return (Book) this;}
    public Periodical toPeriodical(){return (Periodical) this;}
}
