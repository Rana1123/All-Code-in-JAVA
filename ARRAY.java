
package multi;
import java.util.Scanner;
public class ARRAY {

    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,n,m;
       
        Scanner hp=new Scanner(System.in);
        System.out.println("Enter the row number");
        n=hp.nextInt();
        System.out.println("Enter the coulem number");
        m=hp.nextInt();
         int a[][]=new int [n][m];
        int b[][]=new int [n][m];
        int c[][]=new int [n][m];
        System.out.println("Enter the elemant of A");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=hp.nextInt();
            }
        }
        System.out.println("Enter the elemant of B");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                b[i][j]=hp.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("The Final elemant of C");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(" "+c[i][j]);
            }
             System.out.println("");
        }
       
    }
    
}
