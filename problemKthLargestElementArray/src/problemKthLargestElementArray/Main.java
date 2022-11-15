package problemKthLargestElementArray;

import java.io.IOException;
import java.util.PriorityQueue;

class Solution {
	public int findKthLargest(int[] x, int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < k; i++) {
			pq.add(x[i]);
		}

		for (int i = k; i < x.length; i++) {

			if (pq.peek() < x[i]) {
				pq.poll();
				pq.add(x[i]);
			}
		}

		return pq.peek();
	}
}

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

//		InputStreamReader ir = new InputStreamReader(System.in);
//		BufferedReader in = new BufferedReader(ir);

//		double a;
//		int b;
//
//		a = Double.parseDouble(in.readLine());
//		b = Integer.parseInt(in.readLine());

		Solution s = new Solution();

		int[] x = { 3, 2, 1, 5, 6, 4 };

		System.out.println(s.findKthLargest(x, 2));
	}

}
