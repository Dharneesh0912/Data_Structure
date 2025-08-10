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
		boolean arr[]=new boolean[vertices];
		Queue<Integer> queue=new LinkedList<>();

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
		print();
	
	}


}
