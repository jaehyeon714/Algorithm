import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = {"000", "001", "010", "011", "100", "101", "110", "111"};
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - '0';
			sb.append(arr[num]);
		}
		
		if (str.equals("0")) {
			System.out.println(str);
		} else {
			while (sb.charAt(0) == '0') {
				sb = new StringBuilder(sb.substring(1));
			}
			
			System.out.println(sb);
		}
	}

}
