
public class Stack {
	// field
	public Node topNode;
	public int size;
	
	// constructor
	// When constructing a new stack, everything is empty.

	Stack(){
		topNode = null;
		size = 0;
	}
	
	// NEED TO MODIFY
	// methods
	// return true if the stack is empty
	public boolean isEmpty(){
		
		return topNode == null;
	}
	
	// return the number of nodes in the stack
	public int size(){
		if(isEmpty()){
		return 0;
	}
		else{
			return size;
		}
			
		}
	
	// insert the given node to the end of the stack 
	// remember to change the size after you insert
	
	public void push(Node node){
		
		//not sure if this.topNode or just topNode --> may cause error
		Node hold = this.topNode;
		//topNode = new Node();
		topNode = node;
		topNode.nextNode = hold;
		size = size + 1; 
		
	}
	
	// return and remove the most recent added node from the stack
	// remember to change the size after you remove
	// remember to check if the stack is already empty before removing
	
	public Node pop(){
		
		if(isEmpty()){
		return null;
		}
		else{
			Node holder = this.topNode;
			topNode = topNode.nextNode;
			size = size -1;
			return holder;
		}
		
		
		
		
	}
	
	
	
	
	
}
