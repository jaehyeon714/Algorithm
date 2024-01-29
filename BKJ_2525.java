import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		
		int hour = (b + c) / 60;
		int min = (b + c) % 60;
		int thour = a + hour;
		
		if (thour >= 24) {
			thour %= 24;
		}
		
		System.out.println(thour + " " + min);
	}

}
