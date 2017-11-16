import java.util.*;

public class Solution
{

	public static void main(String[] args) 
    {
        List<String> l = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int V = Integer.parseInt(scan.nextLine());
        int E = Integer.parseInt(scan.nextLine());
        // int S = Integer.parseInt(scan.nextLine());
        EdgeWeightedDigraph G = new EdgeWeightedDigraph(V);
        for(int i = 0; i < E;i++) 
        {
            String[] line = scan.nextLine().split(" ");
            int v = Integer.parseInt(line[0]);
            int w = Integer.parseInt(line[1]);
            double weight = Double.parseDouble(line[2]);
            G.addEdge(new DirectedEdge(v, w, weight));
        }
        StdOut.println(G);
        // DijkstraSP sp = new DijkstraSP(G, S);

        // for (int t = 0; t < G.V(); t++) 
        // {
        //     if (sp.hasPathTo(t)) 
        //     {
        //         StdOut.printf("%d to %d (%.2f)  ", S, t, sp.distTo(t));
        //         for (DirectedEdge e : sp.pathTo(t)) 
        //         {
        //             StdOut.print(e + "   ");
        //         }
        //         StdOut.println();
        //     }
        //     else {
        //         StdOut.printf("%d to %d         no path\n", S, t);
        //     }
        // }


        }


        // System.out.print(G);
        // System.out.println(l.size());
        // double d = Math.round(mst.weight()*100.0)/100.0;
        // System.out.println(d);
    // }
}