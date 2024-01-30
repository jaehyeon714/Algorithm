import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		int sMax = Integer.parseInt(A.replaceAll("5", "6"))
				 + Integer.parseInt(B.replaceAll("5", "6"));
		 
		 int sMin = Integer.parseInt(A.replaceAll("6", "5"))
				 + Integer.parseInt(B.replaceAll("6", "5"));
		 
		 System.out.println(sMin + " " + sMax);
	}

}
