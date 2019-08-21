// Write a java program that calculates factorial of a number entered at runtime
class Rahul_Java_20Aug_Q1{  
 public static void main(String args[]){  
  int i,fact=1;  
  int a = Integer.parseInt(args[0]);    
  for(i=1;i<=a;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+a+" is: "+fact);    
 }  
}  