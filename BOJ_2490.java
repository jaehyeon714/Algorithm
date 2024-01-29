import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			switch(a + b + c + d) {
			case 0 :
				System.out.println("D");
				break;
			case 1 :
				System.out.println("C");
				break;
			case 2 :
				System.out.println("B");
				break;
			case 3 :
				System.out.println("A");
				break;	
			case 4 :
				System.out.println("E");
				break;
			}
		}
	}

}
