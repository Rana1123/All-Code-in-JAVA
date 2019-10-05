//Fibonacci Series
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiboncci;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Fiboncci {

    /**
     * @param args the command line arguments
     */
    static Scanner rana=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0,j=1,k,n,m;
        
        System.out.println("Enter the value of n");
        n=rana.nextInt();
        System.out.print(i+" "+j);
        for(m=1;m<=n-2;m++)
        {
            k=i+j; 
            System.out.print(" "+k+" ");
            i=j;
            j=k;
        }
    }
    
}
