// Write a java program which prints odd numbers between 35-86
class Rahul_Java_20Aug_Q3{
	public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       String  primeNumbers = "";

       for (i = 35; i <= 86; i++)         
        { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	        {
               if(i%num==0)
	            {
 		         counter = counter + 1;
	            }
	        }
	      if (counter ==2)
	      	
	        {
	         primeNumbers = primeNumbers + i + " ";
	        }	
        }	
       System.out.println("Prime numbers from 35 to 86 are :");
       System.out.println(primeNumbers);
   } 
}