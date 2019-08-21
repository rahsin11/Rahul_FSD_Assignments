// Write a java program which take a decimal number from user at runtime and then prints it's binary equivalent.
class Rahul_Java_20Aug_Q6{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		System.out.println("Binary representation of : "+num);
    	System.out.println(Integer.toBinaryString(num));
	}
}