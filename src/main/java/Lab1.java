//Centre College

public class Lab1 {

	/**This function will return the sum of the squares from 1 to n.
	* For instance if the number is 5, the solution would be 1*1+2*2+3*3+4*4+5*5= 55. 
	* If the value of n is less than 0, return -1
	*/
	   public static int squares(int n)
	   {
		   if (n < 0)
		   {
			   return -1;
		   }
		   int sumOfSquares=0;
		   
		   for (int i=1 ; i<=n ; i++)
		   {
			sumOfSquares+=i*i;  
		   }
	   
	      return sumOfSquares;  
	   
	   }

	/**
	* This function that takes an array of integers and
	* an integer that describes how many numbers are in the array.  
	* The function will return the index(position) in the array with the largest number.
	* If the array is empty or there is an error, return -1.
	* If the maximum value is not unique, return the index of the first maximuim value.
	*/
	   public static int maxIndex(int array[],int len)
	   {
		   if (len == 0)
		   {
			   return -1;
		   }
		   
		   float maxValue=array[0];
		   
		   for (int i = 0 ; i < len ; i++)
		   {
			   if (array[i]>maxValue) 
			   {
				   maxValue=array[i];
			   }
		   }
		   for (int i = 0 ; i < len ; i++)
		   {
			   if (maxValue==array[i]) 
			   {
				   return i;
			   }
		   }
   
	      return 0;
	   }

	/**
	* This function that takes an array of integers, 
	* an integer that describes how many numbers are in the array.  
	* and a target number to look for.
	* This function will return true if the target number is within the array and false otherwise.
	*/
	   public static boolean seek(int array[],int len,int target)
	   {
		   if (len==0)
		   {
			   return false;
		   }
		   for (int i=0 ; i<len ; i++)
		   {
			   if (target==array[i])
			   {
				   return true;
			   }
		   }
   
	      return false;      
	  	
	      
	   }

	/**
	* This function takes an integer parameter and returns the nth number in the Fibonacci 
	* sequence.  The first 6 numbers of the sequence are as follows.  1,1,2,3,5,8.  Note
	* that 8 is the 6th number.  Be sure that your algorithm can return the
	* first and second Fibonacci numbers correctly.  You should solve this without recursion. 
	* If the input is below 1, retun 0;
	*/
	   public static int fib(int n)
	   {
		   
		   if (n<=0)
		   {
			   return 0;
		   }
		   
		   if (n==1)
		   {
			   return 1;
		   }
		   
		   int a=0,b=1,c;
		   
		   for (int i=1 ; i<n; i++)      
		   {
			c=a+b;
			a=b;
			b=c;
		   }
		   return 0;
	   }

}
