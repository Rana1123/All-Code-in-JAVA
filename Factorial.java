/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

public class Factorial {

    /**
     * @param args the command line arguments
     */
    static Scanner hp=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int i,n,mul = 1;
        System.out.println("Enter the value");
        n=hp.nextInt();
        for(i=n;i>=1;i--)
        {
            mul=mul*i;
        }
        System.out.println(mul);
    }
    
    
}
