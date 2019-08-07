package Library;

public class Book extends LibraryItem {
    String genre;
    int pages;
    boolean isHardcover;
    String author;

    public Book(String name,String author,String genre, int pages){
        super(name);
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.type = "book";
    }

    public boolean getIsHardcover() {return isHardcover;}
    public void setIsHardcover(boolean isHardcover) {this.isHardcover = isHardcover;}
}
