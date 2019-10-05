//Print marks to grade.

package pkgswitch.pkgcase.number;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class SwitchCaseNumber {

    /**
     * @param args the command line arguments
     */
    static Scanner hp=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int marks;
        System.out.println("Enter your marks");
        marks=hp.nextInt();
        switch(marks/10)
        {
            case 10:
            {
                if(marks==100){
                System.out.println("Your grade is A+  and Scolarship"); 
                }
                else 
                    System.out.println("out of rang");
                break;
            }
            case 8:
            {
                System.out.println("Your grade is A+"); 
                break;
            }
            case 7:
            {
                System.out.println("Your grade is A"); 
                break;
            
            }
            case 6:
            {
                System.out.println("Your grade is A-"); 
                break;
            
            }
            case 5:
            {
                System.out.println("Your grade is B"); 
                break;
            
            }
            default:
            {
                System.out.println("Your grade is F"); 
                break;
            
            }
        }
    }
    
}
