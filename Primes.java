import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Primes{
    
    // returns boolean determining whether a positive integer is prime
    public static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        
        for (int i = 2;i <= Math.sqrt(n) ; i++){
            if (n % i == 0)
            return false;
        }
        return true;
    }
    
    static ArrayList<Integer> primes = new ArrayList<Integer>();
    
    // creates list of prime numbers up to 50 000
    static void SieveOfEratosthenes()  {  
        int MAX_SIZE = 50_000;
        boolean [] IsPrime = new boolean[MAX_SIZE];  
          
        for(int i = 0; i < MAX_SIZE; i++) 
            IsPrime[i] = true; 
          
        for (int p = 2; p * p < MAX_SIZE; p++)  {  

            if (IsPrime[p] == true)  
            {  
                for (int i = p * p; i < MAX_SIZE; i += p)  
                    IsPrime[i] = false;  
            }  
        }  
        
        for (int p = 2; p < MAX_SIZE; p++)  
        if (IsPrime[p] == true)  
                primes.add(p); 
            }
    
    // returns the kth prime from the list of prime numbers
    public static int kthPrime(int k){
        SieveOfEratosthenes();
        return primes.get(k);
    }
    
    // returns list of all prime factors of an integer
    public static List<Integer> factorize(int n) {
    List<Integer> factorsList = new ArrayList<>();
    
    while (n % 2 == 0){ 
       factorsList.add(2);
        n /= 2; 
    } 
    
    for (int i = 3; i <= Math.sqrt(n); i+= 2) { 
        while (n % i == 0) { 
            factorsList.add(i);
            n /= i; 
        }
    } 
    
    if (n > 2) {
     factorsList.add(n);  
    }
    return factorsList;
    } 
}
