
package palindromeArray;

import java.util.Scanner;
public class PalindromeArray {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner hp=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=hp.nextInt();
        int arr[]=new int[100];
        for(int i=0;i<n;i++)
        {
            arr[i]=hp.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int temp=arr[i],r,sum=0;
            while(arr[i]!=0)
            {
                r=arr[i]%10;
                sum=(sum*10)+r;
                arr[i]=arr[i]/10;
            }
            if(sum==temp)
            {
                System.out.println(temp+" number is palindeome");
            }
            else
                System.out.println(temp+" Number is Not palindrome");
        }
  
    }
    
}
