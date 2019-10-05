/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Root {

    /**
     * @param args the command line arguments
     */
    static Scanner hp=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        double a,ans;
        System.out.println("Enter the value");
        a=hp.nextDouble();
        ans=Math.sqrt(a);
        String c=String.format("%.2f",ans);
        System.out.println(c);
    }
    
}
