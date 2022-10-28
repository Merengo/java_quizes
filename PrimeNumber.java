// this program lists prime numbers ranging from 1 to 100
public class PrimeNumber
{   
    // a function to check for a prime number
    static boolean isPrime(int n)
    {
        // since 0 and 1 are not prime, then we return false
        if(n==0||n==1)
        {
            return false;
           
        }else{
              // looping from 2 to n-1
            for (int i=2;i<n;i++)
            {
                if(n%i==0){
                    return false;
                }
                
            }
            return true;
        }
       
        
    }
    public static void main(String [] args)
    {   
        int n = 100;
        for (int i=1;i<=100;i++)
        {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
