import java.util.Scanner;
class Rahul_Java_21Aug_Q3{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int [] arr=new int[5];
		int temp=0;
		for (int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();    
		}
		 temp=arr[0];
		 for(int i=1;i<arr.length;i++){
		 	arr[i-1]=arr[i];
		 }
		arr[arr.length-1]=temp;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}