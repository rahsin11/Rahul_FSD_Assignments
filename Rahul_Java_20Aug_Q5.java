// Write a java program which takes 3 numbers from user at runtime, adds them. The program should print PASSING only once if the numbers are individually greater than or equal to 40 and their sum is greater than or equal to 125. Otherwise the output should be FAILING.

// You don't have to use nested if's or logical operators in this program, not if else. You can use multiple ifs

class Rahul_Java_20Aug_Q5{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if(a>=40 && b>=40 && c>=40 && (a+b+c)>=125) 
			System.out.println("Passing");
		else
			System.out.println("Failed");

	}
}