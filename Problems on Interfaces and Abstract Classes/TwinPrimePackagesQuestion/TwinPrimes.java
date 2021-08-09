package twinprimes;
import java.util.Scanner;
import primespackage.Primes;
public class TwinPrimes {
  public static boolean twinprimes(int a, int b){
    return (Primes.checkForPrime(a) && Primes.checkForPrime(b));
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the range: ");
    int x = s.nextInt();
    int y = s.nextInt();
    for(int i=x; i<=y-2; i++){
      int j = i+2;
      boolean check = twinprimes(i, j);
      if(check){
        System.out.println(i + " and " + j + " are twin primes");
      }
    }
  }
}

  
