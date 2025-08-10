package NonLinear;

import java.util.Arrays;

public class DijkstraGraphMatrix {
	static int[][] adjacencyMatrix;
	static int numVertices;
	public DijkstraGraphMatrix(int numvertices) {
		DijkstraGraphMatrix.numVertices=numvertices;
		adjacencyMatrix=new int[numvertices][numvertices];
	}
	public static void addEdge(int src,int dest,int weight) {
		adjacencyMatrix[src][dest]=weight;
	}
	public static void dijkstra(int start) {
		int[] dist=new int[numVertices];
		boolean[] visit=new boolean[numVertices];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start]=0;
		for(int count=0;count<numVertices-1;count++) {
			int mind=minDistance(dist,visit);
			visit[mind]=true;
			for(int v=0;v<numVertices;v++) {
				if(!visit[v] && adjacencyMatrix[mind][v]!=0 && dist[mind]!=Integer.MAX_VALUE) {
					dist[v]=dist[mind]+adjacencyMatrix[mind][v];
				}
			}
		}
		print(dist,start);
	}
	public static void print(int[] dist,int start) {
		System.out.println("Starting place : "+start);
		for(int i=0;i<numVertices;i++) {
			System.out.println(start+"--->"+i+" = "+dist[i]);
		}
		
	}
	public static int minDistance(int[] dis,boolean[] visit) {
		int min=Integer.MAX_VALUE,minIndex=-1;
		for(int v=0;v<numVertices;v++) {
			if(!visit[v] && dis[v]<min) {
				min=dis[v];
				minIndex=v;
			}
		}
		return minIndex;
	}
	
	public static void main(String[] args) {
		DijkstraGraphMatrix ds=new DijkstraGraphMatrix(6);
		addEdge(0,1,4);
		addEdge(0,2,2);
		addEdge(1,2,5);
		addEdge(1,3,10);
		addEdge(3,4,4);
		addEdge(3,5,11);
		dijkstra(0);

		


	}

}
