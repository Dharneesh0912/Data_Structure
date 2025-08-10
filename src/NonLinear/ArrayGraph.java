package NonLinear;
import java.util.ArrayList;
import java.util.List;
public class ArrayGraph {
	static List<List<Integer>> al=new ArrayList<>();
	public ArrayGraph(int vertices) {
		for(int i=0;i<vertices;i++) {
			al.add(new ArrayList<Integer>());
		}
	}
	public static void insert(int src,int des) {
		al.get(src).add(des);
		al.get(des).add(src);
	}
	public static void display() {
		int k=0;
		for(List<Integer> i:al) {
			System.out.println(k+++"--->"+i);
		}
	}
	public static void main(String[] args) {
		ArrayGraph al=new ArrayGraph(5);
		insert(0,1);
		insert(0,2);
		insert(1,2);
		insert(2,3);
		insert(3,4);
		display();
		

	}

}
