
package perfact.number;

import java.util.Scanner;

public class PerfactNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        int i,sum=0,n;
        Scanner hp=new Scanner(System.in);
        System.out.println("Enter the number");
        n=hp.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
         if(sum==n)
            {
                System.out.println("perfect number");
            }
            else
                System.out.println("not perfect number");
    }
    
}
