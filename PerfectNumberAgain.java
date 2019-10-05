
package perfect.number.again;
import java.util.Scanner;
public class PerfectNumberAgain {

    public static void main(String[] args) {
        // TODO code application logic here
        int n,i,sum=0;
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
      if(n==sum)
              System.out.println("perfect number");
          else
              System.out.println("not perfect");
    }
    
}
