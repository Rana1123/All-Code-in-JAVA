//switch case 
 
package marks;

import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner in=new Scanner(System.in);
        System.out.println("ENter Your Number");
        n=in.nextInt();
        switch(n/10)
        {
            case 10:
                System.out.println("You got Scolarship and A+");
                break;
            case 9:
            case 8:
                System.out.println("You got A+");
                break;
            case 7:
                System.out.println("You got A");
                break;
            case 6:
                System.out.println(" You got A-");
                break;
            case 5:
                System.out.println(" You got B");
                break;
            case 4:
                System.out.println(" You got C");
                break;
            default:
                System.out.println("Fail");
                break;
        }
    }
    
}
