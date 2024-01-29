import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sca = new Scanner(System.in);
		 
		 while(sca.hasNextInt()) {
			 int ah = sca.nextInt(), am = sca.nextInt(), as = sca.nextInt();
			 int lh = sca.nextInt(), lm = sca.nextInt(), ls = sca.nextInt();
			 
			 int totalSecondA = ah * 3600 + am * 60 + as;
			 int totalSecondL = lh * 3600 + lm * 60 + ls;
			 
			 int result = totalSecondL - totalSecondA;
			 
			 int h = result / 3600;
			 int m = (result % 3600) / 60;
			 int s = result % 60;
			 
			 System.out.println(h + " " + m + " " + s);
		 }
		 sca.close();
	}

}
