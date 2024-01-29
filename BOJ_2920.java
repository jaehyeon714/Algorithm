import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[8];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] == arr[i] - 1) {
				count++;
			} else if (arr[i-1] == arr[i] + 1) {
				count--;
			} else {
				count = 0;
			}
		}
		
		if (count == 7) {
			System.out.println("ascending");
		} else if (count == -7) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}
}
