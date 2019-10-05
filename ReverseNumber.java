/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.number;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ReverseNumber {

    /**
     * @param args the command line arguments
     */
    static Scanner hp=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int i,n;
        System.out.println("Enter the Number");
        n=hp.nextInt();
       while(n>0)
        {
            i=n%10;
            System.out.print(i+" ");
            n=n/10;
        }
    }
    
}
