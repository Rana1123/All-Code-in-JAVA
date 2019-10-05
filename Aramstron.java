package aramstron;

import java.util.Scanner;

public class Aramstron {

    public static void main(String[] args) {
        // TODO code application logic here
        int n,sum=0,temp,digit;
        Scanner hp=new Scanner(System.in);
        System.out.println("Enter the Number");
        n=hp.nextInt();
        temp=n;
        while(temp>0)
        {
            digit=temp%10;
            sum=sum+digit*digit*digit;
            temp=temp/10;
        }
        if(n==sum)
        {System.out.println("Armstrong number");}
        else
        {System.out.println("Not armstrong");}
    }
    
}
