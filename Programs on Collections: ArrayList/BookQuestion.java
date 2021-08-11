package arraylist;
import java.util.*;
class Book{
    String name;
    String author;
    float price;
    String type;
    public Book(String name, String author, float price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }public void set_values(String name, String author, float price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }public void print_book(){
        System.out.println("Name: " + this.name + "   Author: " + this.author + "   "
                + "Price: " + this.price + "   Type: " + this.type);
    }
}class NameComparator implements Comparator<Book>{
    public int compare(Book b1, Book b2){
        return b1.name.compareTo(b2.name);
    }
}class PriceComparator implements Comparator<Book>{
    public int compare(Book b1, Book b2){
        if (b1.price>b2.price)
            return 1;
        else if (b1.price<b2.price)
            return -1;
        else
            return 0;
    }
}public class BookArrayList {
   public static void main(String[] args) {
       ArrayList<Book> fiction = new ArrayList<Book>();
       ArrayList<Book> comic = new ArrayList<Book>();
       ArrayList<Book> cooking = new ArrayList<Book>();
       Book[] books = new Book[6];
       books[0] = new Book("Harry Potter", "JK Rowling", 800.0f, "fiction");
       books[1] = new Book("Princess Diaries", "Meg Cabot", 400.0f, "fiction");
       books[2] = new Book("Marvel Captain America", "Stanlee", 600.0f, "comic");
       books[3] = new Book("Archies", "Bob Montana", 300.0f, "comic");
       books[4] = new Book("French Cooking", "Julia Child", 400.0f, "cooking");
       books[5] = new Book("Joy of Cooking", "Irma S. Rombauer", 500.0f, "cooking");
       for(int i=0; i<6; i++){
           if(books[i].type == "fiction"){
               fiction.add(books[i]);
           }else if(books[i].type == "comic"){
               comic.add(books[i]);
           }else if(books[i].type == "cooking"){
               cooking.add(books[i]);
           }
       }System.out.println("\nBooks in the fiction list: ");
       for(Book b:fiction){
           b.print_book();
       }System.out.println("");
       System.out.println("\nBooks in the comic list: ");
       for(Book b:comic){
           b.print_book();
       }System.out.println("");
       System.out.println("\nBooks in the cooking list: ");
       for(Book b:cooking){
           b.print_book();
       }System.out.println("");
       Collections.sort(fiction, new NameComparator());
       System.out.println("\nSorting fiction list based on names: ");
       for(Book b:fiction){
           System.out.println("\t" + b.name);
       }Collections.sort(comic, new NameComparator());
       System.out.println("\nSorting comic list based on names: ");
       for(Book b:comic){
           System.out.println("\t" + b.name);
       }Collections.sort(cooking, new NameComparator());
       System.out.println("\nSorting cooking list based on names: ");
       for(Book b:cooking){
           System.out.println("\t" +b.name);
       }Collections.sort(fiction, new PriceComparator());
       System.out.println("\nSorting fiction list based on prices: ");
       System.out.println("\tMinimum Price: " + fiction.get(0).price);
       System.out.println("\tMaximum Price: " + fiction.get(fiction.size() - 1).price);
       Collections.sort(comic, new PriceComparator());
       System.out.println("\nSorting comic list based on prices: ");
       System.out.println("\tMinimum Price: " + comic.get(0).price);
       System.out.println("\tMaximum Price: " + comic.get(comic.size() - 1).price);
       Collections.sort(cooking, new PriceComparator());
       System.out.println("\nSorting cooking list based on prices: ");
       System.out.println("\tMinimum Price: " + cooking.get(0).price);
       System.out.println("\tMaximum Price: " + cooking.get(cooking.size() - 1).price);      
   }
}
