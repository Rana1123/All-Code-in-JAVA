
package volume;

import java.util.Scanner;

public class Volume {

    public static void main(String[] args) {
        double redius,lengh,pi,volume;
        Scanner hp=new Scanner(System.in);
        System.out.println("Enter the redius");
        redius=hp.nextDouble();
        System.out.println("Enter the lengh");
        lengh=hp.nextDouble();
        System.out.println("Enter the pi");
        pi=hp.nextDouble();
        volume=redius*redius*pi*lengh;
        System.out.println("The Volume is = "+volume);
    }
    
}
