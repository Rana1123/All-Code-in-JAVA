
package oop;

import java.util.Scanner;
public class Oop {

    public static void main(String[] args) {
        
       Scanner h=new Scanner(System.in);
       Method hp3 = new Method();
       hp3.gender=h.nextLine();
       hp3.name=h.nextLine();
       hp3.age=h.nextInt();
       hp3.display();
       
       
   
  
   
  
   
        Method hp=new Method("Riaz","Gay",22);
        //System.out.println();
        
       Method hp1=new Method("Hasan","Gay");
        //System.out.println();
      Method hp2=new Method("Nayeem",23);
        //System.out.println();
       //hp.display();
       Method hp4=new Method(23,"rakib","gay");
    }
    
}
