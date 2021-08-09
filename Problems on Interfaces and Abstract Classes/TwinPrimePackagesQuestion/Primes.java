package primespackage;
public class Primes {
  public static boolean checkForPrime(int n){
    boolean prime = false;
    for(int i=2; i<n/2; i++){
      if(n%i == 0)
        return prime;
    }
    return !prime;
  }
}
