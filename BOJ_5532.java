import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		while(true) {
			if (A <= 0 && B <= 0) {
				break;
			}
			
			A -= C;
			B -= D;
			
			count++;
		}
		
		System.out.println(L - count);
	}

}
