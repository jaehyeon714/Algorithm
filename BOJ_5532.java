import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		int kAll = Integer.parseInt(br.readLine());
		int mAll = Integer.parseInt(br.readLine());
		int kDay = Integer.parseInt(br.readLine());
		int mDay = Integer.parseInt(br.readLine());
		
		double study = Math.max(Math.ceil(kAll / Double.valueOf(kDay)),
				Math.ceil(mAll / Double.valueOf(mDay)));
		
		System.out.println(L - (int)study);
	}

}
