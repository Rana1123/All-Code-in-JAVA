/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power2;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Power2 {

    /**
     * @param args the command line arguments
     */
    static Scanner hp=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        double ans,a,p;
        System.out.println("Enter the value of a");
        a=hp.nextDouble();
        System.out.println("Enter the power of a");
        p=hp.nextDouble();
        ans=Math.pow(a,p);
        System.out.println(ans);
    }
    
}

