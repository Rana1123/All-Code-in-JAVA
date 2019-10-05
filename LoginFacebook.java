
package login.facebook;

import java.util.Scanner;

public class LoginFacebook {
    public static void main(String[] args) {
        int b,d,a,c;
        Scanner hp=new Scanner(System.in);
        System.out.println("Enter user name");
        a=hp.nextInt();
        System.out.println("Enter user password");
        b=hp.nextInt();
        System.out.println("Enter user name");
        c=hp.nextInt();
        System.out.println("Enter user passeord");
        d=hp.nextInt();
        if(a==c && b==d)
        {
            System.out.println("Login Successful");
        }
        else if(a==c && b!=d)
        {
            System.out.println("Wrong Password");
        }
        else if(b==d && a!=c)
        {
            System.out.println("Wrong User");
        }
        else
        {
            System.out.println("Wrong both");
        }
    }
    
}
