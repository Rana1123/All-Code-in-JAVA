
package identity;
import java.util.Scanner;
public class Identity {

    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,c=0,c1=0,n,m;
         Scanner hp=new Scanner(System.in);
         System.out.println("Enter the row coulem size number");
        n=hp.nextInt();
       // System.out.println("Enter the coulem number");
      //  m=hp.nextInt();
         int a[][]=new int [n][n];
        System.out.println("Enter the elemant of A");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=hp.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    if(a[i][j]==1)
                    {
                        c++;
                    }
                }
                if(a[i][j]==0)
                {
                    c1++;
                }
            }
        }
        if(c==n && c1==n*n-n)
        {
            System.out.println("This Array is Identity");
        }
        else
        {
            System.out.println("This Array is Not Identity");
        }
    }
    
}
