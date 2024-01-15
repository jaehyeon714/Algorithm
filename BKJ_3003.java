import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int a = 1;
		int b = 1;
		int c = 2;
		int d = 2;
		int e = 2;
		int f = 8;
		
		a = a - sca.nextInt();
		b = b - sca.nextInt();
		c = c - sca.nextInt();
		d = d - sca.nextInt();
		e = e - sca.nextInt();
		f = f - sca.nextInt();
		
		sca.close();
		
		System.out.print(a + " " + b + " " + c + " " + d + " " + e + " " + f);
	}

}
