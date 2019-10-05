
package tread;
import java.lang.*;
import java.util.Scanner;
public class Tread {
static Scanner hp=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
          new A().start();
          new B().start();
          new C().start();
        
    }
    
}
class A extends Thread
{
  //  Scanner hp=new Scanner(System.in);
    //int n=hp.nextInt();
    public void run()
    {
         System.out.println("Start A");
        for(int i=0;i<5;i++)
        {
            System.out.println("\t From Tread A : i= "+i);
        }
        System.out.println("Exit from A");
    }

}
class B extends Thread
{
    //Scanner hp=new Scanner(System.in);
   // int n=hp.nextInt();
    public void run()
    {
        System.out.println("Start B");
        for(int j=0;j<5;j++)
        {
            System.out.println("\t From Tread B : j= "+j);
        }
        System.out.println("Exit from B");
    }

}
class C extends Thread
{
    //Scanner hp=new Scanner(System.in);
  //  int n=hp.nextInt();
    public void run()
    {
         System.out.println("Start C");
        for(int k=0;k<5;k++)
        {
            System.out.println("\t From Tread C : k= "+k);
        }
        System.out.println("Exit from C");
    }

}
