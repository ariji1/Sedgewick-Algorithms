
// import java.util.*;
public class Solution
{

public static void main(String[] args) 
{
		// Scanner sc = new Scanner(System.in);
		String in1 = StdIn.readLine();
		// in1.readLine();
		// System.out.println(in1);
		// In in2 = new In(sc);
		String in2 = StdIn.readLine();
		// System.out.println(in2);
        // In in2 = new In(args[1]);
        String s = in1.trim().replaceAll("\\s+", " ");
        String t = in2.trim().replaceAll("\\s+", " ");
        LongestCommonSubstring lcs = new LongestCommonSubstring();
        StdOut.println("'" + lcs.lcs(s, t) + "'");
	}	
}