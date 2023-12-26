import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str);
		int[] arr = new int[n];
		int count = 1;
		
		for(int i = 0; i < n; i++) {
			String a = br.readLine();
			int b = Integer.parseInt(a);
			arr[i] = b;
 		}
		int max = arr[n-1];
		for(int i =	n-2; i >=0; i--) {
			if(arr[i] > max) {
				max = arr[i];
				count++;
			}
		}
    
		System.out.println(count);
			
	}

}
