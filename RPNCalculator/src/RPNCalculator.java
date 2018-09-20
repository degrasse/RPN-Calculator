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
		
		//  Using Scanner objects to scan through the files
		// and add values to the stack and the queue accordingly.
		
		
	
			Scanner stackScanner;
			try {
				stackScanner = new Scanner(stackFile);
			
			
			while ( stackScanner.hasNext()){
				
				String check = stackScanner.next();
				
				if(check.equals("+") || check.equals("-") ||check.equals("*") ||check.equals("/") ||check.equals("^") ||check.equals("%") ){
					stack.push( new operationNode(check));
					
				}
				
				else{
					double num = Double.parseDouble(check);
					stack.push(new numberNode(num));
					
				}
			
	
	
			}	
			stackScanner.close();

			
		
			
	
			
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
	
			
			
	

		
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

		
	numberNode res = new numberNode(result);
		
	stack.push( res);
		
	}
		
		
	}



	}
	
