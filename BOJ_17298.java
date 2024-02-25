import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] ans = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Stack<Integer> myStack = new Stack<>();
		myStack.push(0);
		for (int i = 1; i < N; i++) {
			while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
				ans[myStack.pop()] = A[i];
			}
			myStack.push(i);
		}
		while (!myStack.isEmpty()) {
			ans[myStack.pop()] = -1;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 0; i < N; i++) {
			bw.write(ans[i] + " ");
		}
		bw.flush();
	}

}
