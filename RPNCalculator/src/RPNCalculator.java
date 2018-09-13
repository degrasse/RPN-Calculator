import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class RPNCalculator {
	  
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		numberNode n1 = null;
		numberNode n2 = null;
		operationNode operator = null;

		Stack stack = new Stack();
		Queue queue = new Queue();

		File stackFile = new File(args[0]);
		File queueFile = new File(args[1]);
		
		// 3. Using Scanner objects to scan through the files
		// and add values to the stack and the queue accordingly.
		// NEED TO MODIFY
		
	
			Scanner stackScanner;
			try {
				stackScanner = new Scanner(stackFile);
			
			
			while ( stackScanner.hasNext()){
				//System.out.println(stackScanner.next());
				String check = stackScanner.next();
				
				if(check.equals("+") || check.equals("-") ||check.equals("*") ||check.equals("/") ||check.equals("^") ||check.equals("%") ){
					stack.push( new operationNode(check));
					//System.out.println(check);
				}
				
				else{
					double num = Double.parseDouble(check);
					stack.push(new numberNode(num));
					//System.out.println(num);
				}
			
	
	
			}	
			stackScanner.close();

			
		
			
	
			
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	
			
			
	
			
			

		
		// 4. now you build your stack and queue from the input file
		// now you can do the calculation!
		// NEED TO MODIFY
		
		// stack version
		
		
		
		//use instanceOf
		//if(node instanceOf operationNode)
		//	(operationNode) node
		
		
		
		
		
		// while the stack is not empty

		// pop the nodes from the stack
		// it should always be number, number, operator
		// if you see any wrong pattern,
		// return an error message
		// if nothing is wrong,
		// save numbers to n1 and n2
		// and do calculation based on the operator
	while(!stack.isEmpty()){
		double result = 0;
			//int count = 0;
		/*	
			Node num1 = stack.pop();
			Node num2 = stack.pop();
			Node oper =stack.pop();
			
			if( num1 instanceof numberNode ){
				n1 = (numberNode) num1;
				System.out.println("This is n1:" + n1.value);
				if (num2 instanceof numberNode){
					n2 = (numberNode) num2;
					if (oper instanceof operationNode){
						operator = (operationNode) oper;
			*/			
			n1 =  (numberNode) stack.pop();
			n2 = (numberNode) stack.pop();
			operator = (operationNode) stack.pop();
						
						if ( operator.equals("+")){
							result = n1.value + n2.value;
						}
						else if(operator.equals("-")){
							result = n1.value + n2.value;
						}
						else if(operator.equals("/")){
							result = n1.value/n2.value;
						}
						else if(operator.equals("*")){
							result = n1.value*n1.value;
						}
						else if(operator.equals("^")){
							result = Math.pow(n1.value, n2.value);
						}
						else if(operator.equals("%")){
							result = n1.value%n2.value;
						}
		//	}
			
			
		//	}
			
			//}
		//	else{
			//	System.out.println("fuck");
				
		
		
		
	
		
		
	numberNode	res = new numberNode(result);
		
	stack.push( res);
		
	}
			
	
			
			

		
		// queue version
		
		// while the queue is not empty
		//while(!queue.isEmpty()){
			// dequeue the nodes from the queue
			// it should always be number, number, operator
			// if you see any wrong pattern,
			// return an error message
			// if nothing is wrong,
			// save numbers to n1 and n2
			// and do calculation based on the operator
		//}
		
		//5. Once the calculations are done
		// print out the results from both files
		// NEED TO MODIFY
		
		
		
		System.out.println(stack.pop());
		//System.out.println(queue.dequeue());
			}



	}
	
