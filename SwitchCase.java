
import java.util.Scanner;


public class SwitchCase {

    static Scanner hp=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        System.out.println("Enter the number");
        n=hp.nextInt();
        switch(n)
        {
            case 1:
            {
                System.out.println("Sanju");
                break;
            }
            case 2:
            {
                System.out.println("Rana");
                break;
            }
            case 3:
            {
                System.out.println("I Love You Sanju");
                break;
            }
            default:
            {
                System.out.println("Nothing");
                break;
            }
        }
    }
 
}
