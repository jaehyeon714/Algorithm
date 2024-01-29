import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num1 = Integer.parseInt(st.nextToken()) - 1;
		int num2 = Integer.parseInt(st.nextToken()) - 1;
		
		int dist = Math.abs(num2/4 - num1/4) + Math.abs(num2%4 - num1%4);
		
		System.out.println(dist);
	}

}
