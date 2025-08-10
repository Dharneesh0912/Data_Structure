package NonLinear;
import java.util.LinkedList;
import java.util.Queue;
public class Graph {
	static int[][]matrix;
	static int vertices;
	public Graph(int vert) {
		this.vertices=vert;
		matrix=new int[vertices][vertices];
	}
	public static void addedges(int src,int desc) {
		matrix[src][desc]=1;
		matrix[desc][src]=1;
	}
	public static void bfs(int start) {
		boolean visited[]=new boolean[vertices];
		Queue<Integer> queue=new LinkedList<>();
		visited[start]=true;
		queue.add(start);
		while(!queue.isEmpty()) {
			int current=queue.poll();
			System.out.print(current+" ");
			for(int i=0;i<vertices;i++) {
				if(matrix[current][i]==1 && !visited[i]) {
					visited[i]=true;
					queue.add(i);
					
				}
			}
		}
		System.out.println();
		System.out.println();

	}
	public static void dfsutil(int start,boolean visited[]) {
		visited[start]=true;
		System.out.print(start+" ");
		for(int i=0;i<vertices;i++) {
			if(matrix[start][i]==1 && !visited[i]) {
				dfsutil(i,visited);
			}
		}
	}
	public static void dfs(int start) {
		boolean[] visited=new boolean[vertices];
		dfsutil(start,visited);
		System.out.println();
		System.out.println();
	}

	public static void print() {
		for(int i=0;i<vertices;i++) {
			for(int j=0;j<vertices;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Graph gh=new Graph(5);
		addedges(0,1);
		addedges(0,2);
		addedges(1,3);
		addedges(2,3);
		addedges(3,4);
		bfs(0);
		dfs(0);
		print();	
	}
}
}

