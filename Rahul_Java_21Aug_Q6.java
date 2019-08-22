import java.util.Scanner;
class Rahul_Java_21Aug_Q6{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				int result;
		
        new Rahul_Java_21Aug_Q6().readData();
	}
    public void readData(){
    	Scanner scan=new Scanner(System.in);
    	int value1;
		int value2;

        System.out.println("Enter two numbers for addition:");
		value1=scan.nextInt();
		value2=scan.nextInt();
		new Rahul_Java_21Aug_Q6().add(value1,value2);
    }

	public void add(int value1,int value2){
        new Rahul_Java_21Aug_Q6().display(value1+value2);
		}
	public void display(int result){
         System.out.println("Addition of two Numbers:"+result);
		}
}