
package oop;


public class Method {
    
   String name,gender;
   int age;
   Method()
   {
       
   }
   void display()
   {
       System.out.println("name = "+name);
       
       System.out.println("gender = "+gender);
       
       System.out.println("age = "+age);
       System.out.println();
   }
   Method (String X,String Y,int Z)
   {
       name=X;
       gender=Y;
       age=Z;
       
        System.out.println("name = "+name);
       
       System.out.println("gender = "+gender);
       
       System.out.println("age = "+age);
       System.out.println();
   }
   Method(String x,String y)
   {
       name=x;
       gender=y;
       System.out.println("name = "+name);
       
       System.out.println("gender = "+gender);
       
       //System.out.println("age = "+age);
       System.out.println();
   }
   Method(String x,int z)
    {
        name=x;
        age=z;
        
        System.out.println("name = "+name);
       
       //System.out.println("gender = "+gender);
       
       System.out.println("age = "+age);
       System.out.println();
       
   }
   Method(int z,String x,String y)
   {
       name=x;
       gender=y;
       age=z;
       
        System.out.println("name = "+name);
       
       System.out.println("gender = "+gender);
       
       System.out.println("age = "+age);
       System.out.println();
       
   }
  
}
