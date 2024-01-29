import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int[] arr = {1, 1, 2, 2, 2, 8};
		
		for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] - sca.nextInt() + " ");
		}
		sca.close();
	}

}
