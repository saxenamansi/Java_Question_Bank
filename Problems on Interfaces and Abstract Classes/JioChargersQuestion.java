package objectorientedproblems;
import java.util.Scanner;

class JioCharges{
    //Customer Name, Number of calls made to Jio, Number of calls made to other services and BillAmount .
    String cust_name;
    private int jio_calls;
    int other_calls;
    JioCharges(){
        this.cust_name = "Mansi Saxena";
        this.jio_calls = 10;
        this.other_calls = 20;
    }
    JioCharges(String cust_name, int jio_calls, int other_calls){
        this.cust_name = cust_name;
        this.jio_calls = jio_calls;
        this.other_calls = other_calls;
    }
    public void getdata(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter values: ");
        this.cust_name = s.nextLine();
        this.jio_calls = s.nextInt();
        this.other_calls = s.nextInt();
    }
    public void showdata(){
        System.out.println("Customer: " + this.cust_name);
        System.out.println("Number of calls made to Jio " + this.jio_calls);
        System.out.println("Number of calls made to other services and BillAmount " + this.other_calls);
    }
    int calculateBillAmount(JioCharges obj){
        int amt = 0;
        if(jio_calls>0 && jio_calls<=200){
            amt+= jio_calls*1;
        }
        else if(jio_calls>200 && jio_calls<=300){
            amt+= jio_calls*2;
        }
        else if(jio_calls>300){
            amt+= jio_calls*5;
        }
        if(other_calls>0 && other_calls<=200){
            amt+= other_calls*2;
        }
        else if(other_calls>200 && other_calls<=300){
            amt+= other_calls*3;
        }
        else if(other_calls>300){
            amt+= other_calls*6;
        }
        System.out.println("The bill for customer " + cust_name + " is Rs. " + amt);
        return amt;
    }
}
public class sampleprob1 {
   public static void main(String[] args){
       JioCharges jobj1 = new JioCharges();
       jobj1.showdata();
       jobj1.calculateBillAmount(jobj1);
       jobj1.getdata();
       jobj1.showdata();
       jobj1.calculateBillAmount(jobj1);
       JioCharges jobj2 = new JioCharges("Raksha Kannu", 20, 30);
       jobj2.showdata();
       jobj2.calculateBillAmount(jobj2);
   }
   private static void getdata(JioCharges jobj1) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }
}
