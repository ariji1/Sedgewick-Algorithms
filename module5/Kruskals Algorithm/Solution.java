import java.util.*;

public class Solution{

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int V = Integer.parseInt(scan.nextLine());
        int E = Integer.parseInt(scan.nextLine());
        EdgeWeightedGraph G = new EdgeWeightedGraph(V);
        for(int i = 0; i < E;i++) {
            String[] line = scan.nextLine().split(" ");
            int v = Integer.parseInt(line[0]);
            int w = Integer.parseInt(line[1]);
            double weight = Double.parseDouble(line[2]);
            G.addEdge(new Edge(v, w, weight));
        }
        KruskalMST mst = new KruskalMST(G);
        for (Edge e : mst.edges()) 
        {
            StdOut.println(e);
        }
        // System.out.print(G);
        // System.out.println(l.size());
        // double d = Math.round(mst.weight()*100.0)/100.0;
        System.out.printf("%.5f",mst.weight());
    }
}