import java.io.*;

public class Cycle
{
	private boolean hasCycle;
	private boolean[] marked;
	
	public Cycle(Solution g)
	{
		if(Cycle.detectSelfLoops(g))
		{
			hasCycle=true;
			return;
		}
		if(hasCycle) return;
		
		if(Cycle.detectParallelEdges(g))
		{
			hasCycle=true;
			return;
		};
		
		marked=new boolean[g.V()];
		for(int i=0;i<g.V();i++)
			if(!marked[i])
				dfs(g,i,i);
	}
	
	public static boolean detectSelfLoops(Solution g)
	{
		for(int i=0;i<g.V();i++)
			for(int j:g.adj(i))
				if(i==j) return true;
		return false;
	}
	
	public static boolean detectParallelEdges(Solution g)
	{
		boolean[] marked=new boolean[g.V()];
	
		for(int i=0;i<g.V();i++)
		{
			for(int j:g.adj(i))
			{
				if(marked[j]) return true;
				marked[j]=true;
			}
			for(int j:g.adj(i)) marked[j]=false;
		}
		
		return false;
	}
	
	private void dfs(Solution g,int v,int u)
	{
		marked[v]=true;
		for(int i:g.adj(v))
			if(!marked[i]) dfs(g,i,v);
			else 
				if(i!=u)
				{
					hasCycle=true;
					return;
				}
	}

	public boolean hasCycle()
	{
		return hasCycle;
	}
	
	public static void main(String[] args)
	{
		PrintWriter output=new PrintWriter(new OutputStreamWriter(System.out),true);
	
		String fileName=args[0];
		Solution g=new Solution(fileName);
		
		Cycle c=new Cycle(g);
		if(c.hasCycle()) output.println("has cycle");
		else output.println("doesn't have cycle");
	}
}