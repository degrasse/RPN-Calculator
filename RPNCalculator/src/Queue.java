
public class Queue {
	// fields
	public Node firstNode;
	public Node lastNode;
	public int size;
		
	// constructor
	// When constructing a new queue, everything is empty.
	public Queue(){
		firstNode = null;
		lastNode = null;
		size = 0;
	}
		
	
	// methods
	// returns true if the queue is empty
	public boolean isEmpty(){
		if( size ==0){
		return true;
		}
		else{
			return false;
		}
	}
		
	// returns the number of nodes in the queue
		
	public int size(){
		if(isEmpty()){
		return 0;
	}
		else {
			return size;
		}
	}
	// insert a node onto the end of the queue
	// remember to change the size of the queue after adding a node

	//enqueue is adding 
	public void enqueue(Node node){
		//add node at the end of the queue 
		Node holdLast = lastNode;
		if(isEmpty()){
			firstNode = node;
			lastNode = firstNode;
			
			}
		else{
			
			lastNode = node;
			lastNode.nextNode = null;
			//set what was the last node equal to the last node
			holdLast.nextNode = lastNode;
		}
		size = size+1;
		
		}
		
	// return and remove the node that was inserted first
	// remember to change the size after you remove
	// remember to check if the queue is already empty before removing
		
	//dequeue is removing 
	public Node dequeue(){
		Node holdFirst = this.firstNode;
		
		if(isEmpty()){
		return null;
		}
		else{

			firstNode = firstNode.nextNode;
			if(isEmpty()){
				firstNode.nextNode = null;
				
			}
			size = size -1;
			return holdFirst;
		
		}
		
		}
		
		
	
		
}
