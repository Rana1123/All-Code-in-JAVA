
package stringpalindrome;
import java.util.Scanner;
public class StringPalindrome {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner rana=new Scanner(System.in);
        char word[]=new char[100];
        System.out.println("Enter The Word");
        word=rana.next().toCharArray();
        int tag=1,n=word.length;
        int i,j;
        for(i=0,j=n-1;i<n-1 && j>=0;i++,j--)
        {
            if(word[i]!=word[j])
            {
                tag=0;
            }
        }
        if(tag==1)
        {
            System.out.print(word);
        System.out.println(" is palindrome word");
        }
        else
             {
            System.out.print(word);
        System.out.println(" is not palindrome word");
        }
    }
    
}
