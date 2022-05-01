package tree.node;
import java.util.ArrayList;

public class Node<T>{
	public T data;
	public ArrayList<Node<T>> list;
	public Node(T data){
		this.data=data;
		list=new ArrayList<>();
	}
}
