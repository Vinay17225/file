Name-Vinay Kumar
Mobile No-8340622751,7764941755
Email id-vinay17225@gmail.com


************////////////////////*****************//////////////////*************************
1. Write a program to print the reverse of the given string.
      public class ReverseString1 {

	public static void main(String[] args) {
		int l,i;
		String r1="codecode";
		String r2="";
		l=r1.length();
		
		for(i=l-1;i>=0; i--) {
			r2=r2+r1.charAt(i);
		}
		System.out.println("Enter the string value r2="+r2);
	}

}



2.  Given a number, check whether it is a prime number or not.

		import java.util.Scanner;

                public class PrimeNumber {
                public static void main(String[] args) {
		int a,count=0;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		for(int i=2; i>=a-1; i++)
		{
		if(a%i==0) {
		count++;
		    }
		}
		if(count==1) 
			System.out.println("prime number");
		else
			System.out.println("Not prime number");
		}
            }


3.  Given an array of numbers, find the maximum and minimum element in the array.
	import java.util.Arrays;  
	import java.util.Collections;  
	import java.util.List;  
	import java.util.stream.Collectors;  
	public class LargestNumber  {  
	public static String findLargestNumber(List<Integer> nums)  {  
 
	Collections.sort(nums, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));  
	return nums.stream().map(Object::toString).collect(Collectors.joining(""));  
	 }  

	public static void main(String args[])  {  
  
	List<Integer> numbers = Arrays.asList(54, 546, 548, 60);  
 
	String largestNumber = findLargestNumber(numbers);  
 
	System.out.println("The largest number is: " + largestNumber);  
	  }  
	}  


4.  Given a number N, print reverse of number N.

      import java.util.Scanner;
      class ReverseNumber {
    
      static int reverseDigits(int num)
       {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
      }
    
      public static void main(String[] args)
      {
        int n;
        System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
        System.out.println("Reverse of no. is "
                           + reverseDigits(n));
      }
   }



5.  Given an array of numbers, find the maximum and minimum element in the array.
         
        import java.util.Arrays;
        public class Array1 {
        public static void main(String[] args) {
		int a[]= {54, 546, 548, 60};
		 Arrays.sort(a);
		 
		System.out.println(a[a.length-1]+" "+a[0]);
		
		
		
	}

}
















































