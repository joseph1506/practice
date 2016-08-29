package practice.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixToPostfix {
	
	public static Map<String,Integer> priority=new HashMap<String,Integer>();
	static{
		priority.put("+", 1);
		priority.put("-", 1);
		priority.put("*", 2);
		priority.put("/", 2);
		priority.put("%", 3);		
	}
	

	public static void main(String[] args) {
		System.out.println("Enter your expression----");
		/*Scanner input= new Scanner(System.in);
		String expression= input.nextLine();*/

        //String expression="2+3*5-3*4";
        String expression="2-5+3*5-6";
		String convertedString=convertToPostFix(expression);
		System.out.println("after conversion------>"+convertedString);
	}

	private static String convertToPostFix(String expression) {
		Stack<String> expStack= new Stack<String>();
		String finalExp="";
		// TODO Auto-generated method stub
		for(int count=0;count<expression.length();count++){
			String entry=String.valueOf(expression.charAt(count));
			if(!priority.containsKey(entry)){
				finalExp+=entry;
			}else{
				while(!expStack.isEmpty() && isTopHigherThanEntry(expStack.peek(),entry)){
					finalExp+=expStack.pop();
				}
				expStack.push(entry);				
			}			
		}
		
		while(!expStack.isEmpty()){
			finalExp+=expStack.pop();			
		}		
		return finalExp;
	}

	private static boolean isTopHigherThanEntry(String top, String entry) {
		int topPriority=priority.get(top);
		int entryPriority=priority.get(entry);
		if(topPriority>=entryPriority){
			return true;
		}
		return false;
	}
}
