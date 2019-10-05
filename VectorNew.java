
package vector.pkgnew;
import java.util.Vector;
public class VectorNew {

    public static void main(String[] args) {
        // TODO code application logic here
        Vector v=new Vector();
        v.addElement("Captain");
        v.addElement("Rana");
        v.addElement("Nuhin");
        v.insertElementAt("Feroz", 1);
        System.out.println(v);
        for(int i=0;i<v.size();i++)
        {
            System.out.println(v.elementAt(i));
        }
        v.remove("Captain");
        for(int i=0;i<v.size();i++)
        {
            System.out.println(v.elementAt(i));
        }
        v.removeElementAt(0);
        for(int i=0;i<v.size();i++)
        {
            System.out.println(v.elementAt(i));
        
        }
    }
    
}
