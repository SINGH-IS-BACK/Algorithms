import java.util.*;

class Node{
	int start;
	int end;
	int min;
	Node left;
	Node right;
	public Node(int start, int end, int minimum, Node left, Node right){
		this.start = start;
		this.end = end;
		min = minimum;
		this.left = left;
		this.right = right;
	}
}

class RangeArrayTree{

	public Node create(int[] array, int i, int j){
		if(i==j)
			return new Node(i,j, array[i], null, null);
		
		int mid = (i+j)/2;
		Node left = create(array,i,mid);
		Node right = create(array,mid+1, j);
		int min = Math.min(left.min, right.min);
		return new Node(i, j , min, left, right);

	}

	public int Minimum(Node root, int i, int j){
		System.out.println("kamal" + i + " " + j);
		if(i==root.start && j == root.end)
			return root.min;
		int mid = (root.start+root.end)/2;
		if(i>mid)
			return Minimum(root.right,i,j);
		if(j<=mid)
			return Minimum(root.left,i,j);
		//if(i<=mid && j > mid)
		return Math.min(Minimum(root.left,i,mid), Minimum(root.right,mid+1,j));

	}

	public static void main(String args[]){
		RangeArrayTree rat = new RangeArrayTree();	
		int[] array = new int[6];
		for(int i = 0 ; i < 6 ; i++){
			array[i] = i+3;
		}
		array[4]=2;
		Node root = rat.create(array,0,5);
		System.out.println(rat.Minimum(root, 1,3));
	}

}
