import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
class LinkedList{
	Node head;
	private static class Node{
		Node next;
		int data;
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public LinkedList(){
		this.head=null;
	}
	public LinkedList(int data){
		this.head=new Node(data);
	}
	public int delete(int index){
		Node temp=this.head;
		int current_index=1;
		if(index==0){
			this.head=this.head.next;
			return temp.data;
			

		}
		else{
			while(current_index<index){
				temp=temp.next;
				current_index++;
			}
		
			Node deleted_node=temp.next;
			temp.next=deleted_node.next;
			return deleted_node.data;
		}
		
	}
	public void insert(int index,int data){
		Node temp=this.head;
		int current_index=1;
		if(index==0){
			this.head=new Node(data);
			this.head.next=temp;
		}
		else{
			while(current_index!=index){
				temp=temp.next;
				current_index++;		
			}
			Node old_next=temp.next;
			temp.next=new Node(data);
			temp.next.next=old_next;
		}
	}
	public void append(int data){
		Node temp=this.head;
		while(temp.next!=null){
			temp=temp.next;
		}
		Node new_node=new Node(data);
		temp.next=new_node;
	}
	public void traverse(){
		Node temp=this.head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public int getLength(){
		Node temp=this.head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;

		}
		return count;		
	}
	public boolean search(int data){
		Node temp=this.head;
		while(temp!=null){
				if(temp.data==data){
					return true;
				}
				temp=temp.next;
		}
		return false;
	}
	public int getNode(int index){
		Node temp=this.head;
		int current_index=0;
		while(current_index!=index){
			temp=temp.next;
			current_index++;
		
		}
		return temp.data;
	}

	public int getFromLastNode(int nodeFromLast){
		int length=this.getLength();
		int indexFromStart=length-nodeFromLast;
		return this.getNode(indexFromStart);
	}
	public int getMiddleElement(){
		Node first=this.head;
		Node faster=first.next.next;
		while(faster !=null &&faster.next!=null){
			first=first.next;
			faster=faster.next.next;
		}
		return first.next.data;
	}
	public int count(int data){
		Node temp=this.head;
		int count=0;
		while(temp!=null){
			if(temp.data==data){
				count++;
			}
			temp=temp.next;
		}
		return count;
	}
	public long lengthOfLoop(){
		Node temp=this.head;
		HashMap<Node,Long> map=new HashMap<Node,Long>();
		long i=0l;
		boolean flag=false;
		Node last=null,lop=null;
		while(temp!=null){
			if(map.containsKey(temp)){
				lop=temp;
				flag=true;
			}
			else{
				map.put(temp,i);
				last=temp;
			}
			i=(i+1);
			temp=temp.next;
		}
		if(flag){
			return map.get(last)-map.get(lop);

		}
		else{
			return 0l;
		}
		

	}



	public boolean detectLoop(){
		HashSet<Node> set=new HashSet<Node>();
		Node temp=this.head;
		while(temp!=null){
			if(!set.add(temp)){
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	public boolean fastLoopDetect(){
		Node first=this.head;
		Node second=this.head.next;
		while(second!=null && second.next!=null){
			if(first==second){
				return true;
			}
			first=first.next;
			second=second.next.next;
		}
		return false;
	}
	public boolean palindrome(){
		Node temp=this.head;
		ArrayList<Integer> list=new ArrayList<Integer>();


		return false;
	}


	public static void main(String[] args){
		LinkedList ls=new LinkedList(1);
		ls.append(3);
		ls.append(4);
		ls.append(3);
		ls.append(1);
		ls.append(10);
	//	ls.append(5);
	/*	ls.append(6);
		ls.append(7);
		ls.append(8);*/
		//ls.append(8);
	//	ls.traverse();
	//	ls.insert(0,10);
		ls.traverse();
		System.out.println("After delete:");
		//System.out.println(ls.delete(0));

//		ls.delete(3);
		ls.traverse();
		System.out.println("length:"+ls.getLength());
		System.out.println("search:"+ls.search(5));
		System.out.println("search:"+ls.search(10));
		for(int i=0;i<3;i++){
			System.out.println("node at index:"+i+" is:"+ls.getNode(i));
		}
		for(int i=1;i<=3;i++){
			System.out.println("nth:"+i+" from end :"+ls.getFromLastNode(i));
		}
		System.out.println("middle element is:"+ls.getMiddleElement());
		for(int i=0;i<=10;i++){
			System.out.println("count of:"+i+" is:"+ls.count(i));
		}
		System.out.println("detect loop:"+ls.detectLoop());
		System.out.println("fast loop detect:"+ls.fastLoopDetect());
		System.out.println("length of loop:"+ls.lengthOfLoop());
	}	









}
