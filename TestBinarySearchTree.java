//U10416019鄭文琪

import java.security.SecureRandom;

public class TestBinarySearchTree{
	public static void main(String[] args){
		//data field
		int[] number = new int[20];
		SecureRandom random = new SecureRandom();
		
		//create twenty random numbers and input them in the array
		for(int i = 0; i < 20; i++){
			number[i] = random.nextInt(100);
		}

		//print the random numbers
		System.out.println("The random number is : ");
		for(int i = 0; i < 20; i++){
			System.out.print(number[i] + "  ");
		}
		System.out.println("");
		System.out.println("");
		
		//create a variable binary to call BinarySearchTree class
		BinarySearchTree binary = new BinarySearchTree(number);
		
		//print the answer of the binary search tree
		System.out.println("After binary search tree : ");
		binary.printAnswer();
		
	}
}