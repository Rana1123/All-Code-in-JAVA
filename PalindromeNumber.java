package Masudjaaj;
import java.util.Scanner;
public class PalindromeNumber {

    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        Scanner hp=new Scanner(System.in);
        System.out.println("Enter the number");
        char size=hp.next().charAt(0);
        char name[]=new char[size];
        int tag=1;
        for(  i=0;i<=size/2;i++)
        {
            for(j=size-1;j>=size/2;j--)
            {
                if(name[i]!=name[j])
                {
                    tag=0;
                    break;
                }
            }
        }
        if(tag==1)
        {
            System.out.println("masud");
        }
        else
            System.out.println("Rana");
    }
    
}
