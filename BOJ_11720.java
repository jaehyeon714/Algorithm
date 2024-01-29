import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sca = new Scanner(System.in);
		 int N = sca.nextInt();
		 String sNum = sca.next();
		 
		 char[] cNum = sNum.toCharArray();
		 int sum = 0;
		 
		 for (int i = 0; i < cNum.length; i++) {
			 sum +=  cNum[i] - '0';
		 }
		 sca.close();
		 System.out.println(sum);
	}

}
