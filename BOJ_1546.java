import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sca = new Scanner(System.in);
		 int N = sca.nextInt();
		 int[] arr = new int[N];
		 
		 for (int i = 0; i < N; i++) {
			 arr[i] = sca.nextInt();
		 }
		 
		 long max = 0;
		 long sum = 0;
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i] > max) {
				 max = arr[i];
			 }
			 sum += arr[i];
		 }
		 
		 System.out.println(sum * 100.0 / max / N);
	}

}
