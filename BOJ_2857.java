import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = new String[5];
		
		for (int i = 0; i < 5; i++) {
			arr[i] = br.readLine();
		}
		
		boolean foundFBI = false;
		
		for (int i = 0; i < 5; i++) {
			if (arr[i].contains("FBI")) {
				System.out.print((i + 1) + " ");
				foundFBI = true;
			}
		}
		
		if (!foundFBI) {
			System.out.println("HE GOT AWAY!");
		}
	}

}
