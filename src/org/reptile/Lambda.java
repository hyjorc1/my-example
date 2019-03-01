package org.reptile;

interface FuncInterface 
{ 
    void abstractFun(int x); 
   
    default void normalFun() 
    { 
       System.out.println("Hello"); 
    } 
} 
  
class Lambda 
{ 
    public static void main(String args[]) 
    { 

        FuncInterface fobj = (int x) -> {
        	x = 2 * x;
        	System.out.println(x); 
        };
   
        fobj.abstractFun(5); 
    } 
} 
