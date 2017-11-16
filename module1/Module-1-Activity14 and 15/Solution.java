import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution
{
public static void main(String[] args)
	{
    PrintWriter output = new PrintWriter(new OutputStreamWriter(System.out),true);  
		int v = StdIn.readInt();
		int e = StdIn.readInt();
    int t = StdIn.readInt();
		Graph g = new Graph(v);
		int flag = 0;
		for ( int i = 0;i<e;i++)
        {
            while (!StdIn.isEmpty()) 
            {
               if (flag == 0)
               {
                String te = StdIn.readLine();
                flag++;
               }
               else
                {
                    String b = StdIn.readLine();
                    String[] a = b.split(" ");
                    int n = Integer.parseInt(a[0]);
                    int m = Integer.parseInt(a[1]);
                    g.addEdge(n,m);
                }
            }
        }    
          DepthFirstPaths dfp=new DepthFirstPaths(g,t);
        
          // PrintWriter output=new PrintWriter(new OutputStreamWriter(System.out),true);
          
          for(int i=0;i<g.V();i++)
          {
            Stack<Integer> stack = new Stack<Integer>();
            if(dfp.hasPathTo(i))
            {
              output.printf("%d to %d: "+" ",t,i);
              for(int j:dfp.pathTo(i))
                // output.print(j+"-");

                   stack.push(j);
              String ll = stack.toString();   
              output.println(ll.substring(0, ll.length() - 1));
              // output.println();
            }
          }
   	}
}