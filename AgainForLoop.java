// Sum get user
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package again.pkgfor.loop;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AgainForLoop {

    /**
     * @param args the command line arguments
     */
    static Scanner hp=new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int i,n,sum=0;
        System.out.println("Enter the number");
        n=hp.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
    
}
