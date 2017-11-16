public class Solution
{

	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(StdIn.readLine());
		String n2 = StdIn.readLine();
		String text = n2.replaceAll("\\s+", " ");
		LongestRepeatedSubstring lrs = new LongestRepeatedSubstring();
		lrs.lrs(text,n1);
	}
}