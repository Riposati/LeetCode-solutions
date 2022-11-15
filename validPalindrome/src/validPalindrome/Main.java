package validPalindrome;

class Solution {
	public boolean isPalindrome(String s) {

		String str = s.replaceAll("[^a-zA-Z0-9]", "");

		StringBuilder sb = new StringBuilder(str);

//		System.out.println(sb);
//		System.out.println(sb.reverse());

		String aux = sb.toString().toLowerCase();
		String aux2 = sb.reverse().toString().toLowerCase();

		for (int i = 0; i < sb.length(); i++) {
			if (aux.charAt(i) != aux2.charAt(i)) {
				return false;
			}
		}

		return true;
	}
}

public class Main {

	public static void main(String[] args) {

		String aux = "A man, a plan, a canal: Panama";

		Solution s = new Solution();

		System.out.println(s.isPalindrome(aux));
	}

}
