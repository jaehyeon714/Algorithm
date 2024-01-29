import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int N = sca.nextInt();
		sca.close();
		
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < i+1; k++) {
				System.out.print("*");
			}
			
			for (int y = 0; y < i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < N-1; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			
			for (int k = i; k < N-1; k++) {
				System.out.print("*");
			}
			
			for (int y = i+1; y < N-1; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
