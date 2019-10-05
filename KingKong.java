
package MultithreadPrograming;

public class KingKong {

    public static synchronized void main(String[] args) {
        // TODO code application logic here
        Thread t=new Thread()
        {
            public void run()
            {
                kong ();
            }
        };
            t.run();
            System.out.println("King");
        
    }
    public static synchronized void kong()
    {
        System.out.print("Kong");
    }
    
}
