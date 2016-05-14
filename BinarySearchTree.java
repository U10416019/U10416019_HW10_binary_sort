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
	
	//this method is add the number in the binary search tree
	public void addNum(int element){
		//get the first number
		if(size == 0){
			root = new BinaryNode(element);
			size++;
		}
		else {
			//determine the right and left node
			if(element >= (int)root.element){
				addToRight(element, root);
			}
			else if(element < (int)root.element){
				addToLeft(element, root);
			}
		}
	}
	
	//this method is add the number to the right node
	public void addToRight(int element, BinaryNode temp){
		//if the right node of the number is null then let the new number to the right node
		if(temp.right == null){
			temp.right = new BinaryNode(element);
			size++;
		}
		//if the new number is bigger or equal then the root number, call the add right node method
		else if((int)(temp.right).element <= element){
			addToRight(element, temp.right);
		}
		//if the new number is smaller then the root number, call the add left node method
		else if((int)(temp.right).element > element){
			addToLeft(element, temp.right);
		}
	}
	
	//this method is add the number to the left node
	public void addToLeft(int element, BinaryNode temp){
		//if the left node of the number is null then let the new number to the left node
		if(temp.left == null){
			temp.left = new BinaryNode(element);
			size++;
		}
		//if the new number is bigger or equal then the root number, call the add right node method
		else if((int)(temp.left).element <= element){
			addToRight(element, temp.left);
		}
		//if the new number is smaller then the root number, call the add left node method
		else if((int)(temp.left).element > element){
			addToLeft(element, temp.left);
		}
	}
	
	//print the binary search tree answer
	public void printAnswer(){
		//print the left of the root number
		if(root.left != null){
			changeRoot(root.left);
		}
		//print the root number
		System.out.print(root.element + "  ");
		//print the right of the root number
		if(root.right != null){
			changeRoot(root.right);
		}
		
	}
	
	//print the stream under the root number
	public void changeRoot(BinaryNode change){
		//print the left of the stream number
		if(change.left != null){
			changeRoot(change.left);
		}
		//print the stream number
		System.out.print(change.element + "  ");
		//print the right of the stream number
		if(change.right != null){
			changeRoot(change.right);
		}
	}
}
