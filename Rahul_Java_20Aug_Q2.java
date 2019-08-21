// Write a java program to print fibonocci series from 1 to 89
class Rahul_Java_20Aug_Q2{
	public static void main(String[] args) {
		int a=1;
		int b=1;
		System.out.print(a+" "+b+" ");
		int c=a+b;
		while(c<=89){
			// third=first+second;
			System.out.print(c+" ");
			
			a=b;
			b=c;
			c=a+b;
		}
	}
}