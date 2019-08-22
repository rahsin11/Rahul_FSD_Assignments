import java.util.Scanner;

class Rahul_Java_21Aug_Q1{
	public static void main(String[] args) {
    System.out.println("Enter any Number:");
    //int num=4;
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();

	for(int i=0; i<=num; i++){
		for(int j=0; j<=i; j++){
			System.out.print("*");
		}
		System.out.print("\n");
	}	
	}
}