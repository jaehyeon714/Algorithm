import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int index = 0;
			
			while(n > 0) {
				if (n % 2 == 1) {
					System.out.print(index + " ");
				}
				n /= 2;
				index++;
			}
			System.out.println();
		}
	}

}
