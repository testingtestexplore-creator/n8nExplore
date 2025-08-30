package Java;

public class checkPrimeNumber {

    public static void main(String[] args) {
        System.out.println(checkPrime(8));
        System.out.println(checkPrime(10));
   
    }

    public static boolean checkPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    

}
