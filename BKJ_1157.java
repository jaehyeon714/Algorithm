import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[26];
		String str =  br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if ('a' <= ch && ch <= 'z') {
				arr[ch -'a']++;
			} else {
				arr[ch - 'A']++;
			}
		}
		
		int max = -1000;
		char ch = ' ';
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65);
			} else if (arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
	}

}
