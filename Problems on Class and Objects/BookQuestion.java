package objectorientedproblems;
public class Book {
    String BookName;
    char Booktype;
    String publisher;
    int ISBN;
    double price;
    
    Book(String BookName, char Booktype, String publisher, int ISBN, double price){
        this.BookName = BookName;
        this.Booktype = Booktype;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.price = price;
    }
        
    public void display(){
        System.out.println("BookName: \t" + BookName);
        System.out.println("Booktype: \t" + Booktype);
        System.out.println("publisher: \t" + publisher);
        System.out.println("ISBN: \t\t" + ISBN);
        System.out.println("price: \t\t" + price);  
        System.out.println("");
    }
    
    public void check_booktype(){
        int c = 100;
        int e = 200;
        int p = 300;
        int g = 400;
        switch(this.Booktype){
            case 'c':
                if(this.price>=c){
                    System.out.println("Price of book is more than given value");
                    display();
                }
                else{
                    System.out.println("Price of book is not more than given value");
                }
                break;
            case 'e':
                if(this.price>=e){
                    System.out.println("Price of book is more than given value");
                    display();
                }
                else{
                    System.out.println("Price of book is not more than given value");
                }
                break;
            case 'p':
                if(this.price>=p){
                    System.out.println("Price of book is more than given value");
                    display();
                }
                else{
                    System.out.println("Price of book is not more than given value");
                }
                break;
            case 'g':
                if(this.price>=g){
                    System.out.println("Price of book is more than given value");
                    display();
                }
                else{
                    System.out.println("Price of book is not more than given value");
                }
                break;
        }
    }    
   public static void main(String[] args){
       Book book1 = new Book("Introduction to Java", 'c', "ABC", 1234, 350.0);
       book1.check_booktype();
       Book book2 = new Book("Quantum Physics", 'p', "XYZ", 5678, 200);
       book2.check_booktype();
   }
}
