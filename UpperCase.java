
package upper.pkgcase;
import java.util.Scanner;
public class UpperCase {

    public static void main(String[] args) {
        // TODO code application logic here
        char ch;
        Scanner in=new Scanner(System.in);
        ch=in.next().charAt(0);
        if( ch>=65 && ch<=90)
        {
            System.out.println("Upper case");
        }
        else {
            if(ch>=97 && ch<=122)
            System.out.println("Lower case");
            else
                System.out.println("Please type Character");
        }
    }
    
}
