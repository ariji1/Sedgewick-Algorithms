public class Solution
{
	
	public static void main(String[] args) {
		

		Quick3string quicks = new Quick3string();
		String[] a = StdIn.readAllStrings();
        int n = a.length;

        // sort the strings
        quicks.sort(a);

        // print the results
        for (int i = 0; i < n; i++)
            StdOut.println(a[i]);
	}
}