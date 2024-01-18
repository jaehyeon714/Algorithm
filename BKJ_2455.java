import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sca = new Scanner(System.in);
		 
		 int max = -1000;
		 int num = 0;
		
		 for (int i =  0; i < 4; i++) {
			 int A = sca.nextInt();
			 int B = sca.nextInt();
			 
			 num = num - A + B;
			 
			 if (num > max) {
				 max = num;
			 }
		 }
    
		 sca.close();
		 
		 System.out.println(max);	
	}

}
