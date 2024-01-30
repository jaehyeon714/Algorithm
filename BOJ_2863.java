import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sca = new Scanner(System.in);
		 int[][] arr = new int[2][2];
		 
		 for (int i = 0; i < 2; i++) {
			 for (int j = 0; j < 2; j++) {
				 arr[i][j] = sca.nextInt();
			 }
		 }
		 
		 double max = -10000.0;
		 int turn = 0;
		 for (int i = 0; i < 4; i++) {
			 int temp = 0;
			 if ((double)arr[0][0]/arr[1][0] + (double)arr[0][1]/arr[1][1] > max) {
				 max = (double)arr[0][0]/arr[1][0] + (double)arr[0][1]/arr[1][1];
				 turn = i;
			 } 
			 temp = arr[0][0];
			 arr[0][0] = arr[1][0];
			 arr[1][0] = arr[1][1];
			 arr[1][1] = arr[0][1];
			 arr[0][1] = temp;
		 }
		 
		 System.out.println(turn);
		 
	}

}
