
package replece;

import java.util.Scanner;

public class Replece {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Scanner hp=new Scanner(System.in);
        
        String sentance;
       
        sentance=hp.nextLine();
        
        System.out.println("Enter the What char change you");
        
        char a=hp.next().charAt(0);
        
        System.out.println("Enter replaceing char");
        
        char b=hp.next().charAt(0);
        
       System.out.println(sentance.replace(a,b));
    }
    
}
