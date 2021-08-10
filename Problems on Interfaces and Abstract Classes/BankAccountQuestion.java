package inheritanceproblems;
import java.util.Scanner;
class Account{
    double balance;
    Account(double balance){
        if(balance>0.0){
            this.balance = balance;
        }
        else{
            System.out.println("Invalid balance");
            System.out.println("Enter balance: ");
            Scanner s = new Scanner(System.in);
            this.balance = s.nextDouble();
        }  
    }
    public void credit(double credit){
        this.balance += credit;
    }
    public void debit(double debit){
        if(debit> this.balance){
            System.out.println("Enter valid amount");
            debit = 0;
        }
        else{
            this.balance-=debit;
        }
    } 
    public void enquiry(){
        System.out.println("Ask Enquiry");
    }
}
class SavingsAccount extends Account{
    double rate;

    public SavingsAccount(double balance, double rate) {
        super(balance);
        this.rate = rate;
    }
    public double calculateInterest(){
        return this.balance*this.rate;
    }    
}
class CheckingAccount extends Account{
    double fee;

    public CheckingAccount(double balance, double fee) {
        super(balance);
        this.fee = fee;
    }
    public void credit(double credit){
        this.balance -= this.fee + credit;        
    }
    public void debit(boolean withdraw, double debit){
        if(debit> this.balance){
            System.out.println("Enter valid amount");
            debit = 0;
        }
        else{
            this.balance-=debit - this.fee;
        }
    }
    
}
public class inheritance3 {
//    public static void main(String[] args){
//        SavingsAccount sobj = new SavingsAccount(10000.0d, 0.068d);
//        CheckingAccount cobj = new CheckingAccount(200000.0d, 0.079d);
//        double interest = sobj.calculateInterest();
//        sobj.credit(interest);
//        System.out.println("Final balance: " + sobj.balance);
//    }
}
