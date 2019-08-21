// Write a java program which prints the table of a number upto it's limit. The numbers should be taken from runtime. Output in format:
// 4 * 1 = 4
class Rahul_Java_20Aug_Q4{public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int i=1,product=1;
		while(i<=10)
		{	
			product=num*i;
			System.out.println(num+" * "+i+" = "+product);
			i++;
		}
	}
	}