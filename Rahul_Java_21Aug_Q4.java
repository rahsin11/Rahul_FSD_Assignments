import java.util.Arrays;
class Rahul_Java_21Aug_Q4 {
    	public static void main(String[] args) {
        int[] a={56, 33, 222, -9, 6};
		int n = a.length; 
        for (int i = 0; i < n-1; i++) 
        { 
            int mid = i; 
            for (int j = i+1; j < n; j++) 
                if (a[j] < a[mid]) 
                    mid = j;   
            int temp = a[mid]; 
            a[mid] = a[i]; 
            a[i] = temp; 
        } 
        for (int i=0; i<n; ++i) 
            System.out.print(a[i]+" "); 	
	}
}