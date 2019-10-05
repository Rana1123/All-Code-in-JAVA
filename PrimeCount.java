
package prime.count;

import java.util.Scanner;

public class PrimeCount {

    static Scanner hp=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
         int n,i,j,count;
        System.out.print("Enter the value\n");
        n=hp.nextInt();
        for(i=2;i<n;i++)
        {
            count=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.print(i+" ");
                System.out.println(" is a prime Number");
            }
            
            
        }
    
    }
    
}
