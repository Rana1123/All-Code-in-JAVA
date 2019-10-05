
package magic.squre;
import java.util.Scanner;
public class MagicSqure {

    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner hp=new Scanner(System.in);
        n=hp.nextInt();
        if(n%2==0)
        {
            System.out.println("error");
        }
        else
        {
            int magic [] []=new int[n][n];
            int row=n-1;
            int col=n/2;
            magic[row][col]=1;
            for(int i=2;i<=n*n;i++)
            {
                if(magic[(row+1)%n][(col+1)%n]==0)
                {
                    row=(row+1)%n;
                    col=(col+1)%n;
                }
                else
                {
                    row=(row-1+n)%n;
                }
                magic[row][col]=i;
            }
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(magic[i][j]<10)
                        System.out.print("   ");
                    if(magic[i][j]<100)
                        System.out.print("   ");
                    
                    System.out.print(magic[i][j]+"");
                }
                System.out.println();
            }
            
        }
    }
    
}
