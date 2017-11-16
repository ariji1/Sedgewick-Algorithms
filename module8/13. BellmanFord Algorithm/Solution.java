import java.util.*;
import java.text.*;

public class Solution
{

	public static void main(String[] args) 
    {
        // List<String> l = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int testcase = Integer.parseInt(scan.nextLine());

        for(int q = 0;q<testcase;q++)
        {

        int V = Integer.parseInt(scan.nextLine());
        int E = Integer.parseInt(scan.nextLine());
        int S = Integer.parseInt(scan.nextLine());
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(V);
        for(int i = 0; i < E;i++) {
            String[] line = scan.nextLine().split(" ");
            int v = Integer.parseInt(line[0]);
            int w = Integer.parseInt(line[1]);
            double weight = Double.parseDouble(line[2]);
            G.addEdge(new DirectedEdge(v, w, weight));
        }
        BellmanFordSP sp = new BellmanFordSP(G, S);

         if (sp.hasNegativeCycle()) {
            for (DirectedEdge e : sp.negativeCycle())
                StdOut.println(e);
        }

        else
        {

        for (int t = 0; t < G.V(); t++) 
        {
            if (sp.hasPathTo(t)) 
            {
                DecimalFormat fmt = new DecimalFormat("0.0#");
                StdOut.printf("%d to %d : %s", S, t, fmt.format((sp.distTo(t))));
                // for (DirectedEdge e : sp.pathTo(t)) 
                // {
                //     // StdOut.print(e + "   ");
                // }
                StdOut.println();
            }
            else {
                // StdOut.printf("%d to %d         no path\n", S, t);
            }
        }
    }


        }
    }

}