//U10416019鄭文琪

public class BinarySearchTree{
	//create a class to defined a node
	static class BinaryNode<E>{
		E element;
		//create left and right variable which type is node
		BinaryNode<E> left;
		BinaryNode<E> right;
		
		public BinaryNode(E e){
			element = e;
		}
	}
	
	//data fields
	private int size = 0;
	private BinaryNode root;
	private int[] number = new int[20];
	
	//create a no argument constructor
	public BinarySearchTree(){
	}
	
	//create a constructor
	public BinarySearchTree(int[] number){
		//let the random values input to the array
		for(int i = 0; i < 20; i++){
			this.number[i] = number[i];
		}
		//create the binary search tree
		for(int i = 0; i < 20; i++){
			addNum(number[i]);
		}
	}
	
}
