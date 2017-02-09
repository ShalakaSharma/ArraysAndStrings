package ArraysStrings;

import java.util.Stack;

public class ParenthesisChecker {
	
	public static boolean checkParenthesisSingleType(String str) {
		
		if(str == null || str.length()==0 ) {
			return false;
		}
		
		boolean result = true;
		
		int open = 0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '(') {
				open++;
			} else if(str.charAt(i) == ')') {
				open--;
			} else {
				//Invalid Character
				open = -1;
			}
			if(open<0) {
				break;
			}
		}
		if(open != 0) {
			result = false;
		}
		
		return result;
	}

	public static boolean parenthesisChecker(String str) {
		if(str == null || str.length()==0 ) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		boolean result = true;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if((c == ')' || c == '}' || c == ']') && !stack.isEmpty()) {
				char popped = stack.pop();
				if(!((c == ')' && popped == '(') || (c == '}' && popped == '{') || (c == ']' && popped == '['))) {
					result = false;
					break;
				}
			} else {
				result = false;
				break;
			}
		}
		if(result && !stack.isEmpty()) {
			result = false;
		}
		
		return result;
	}	
	
	public static void main(String args[]) {
		String str = "((((()))))";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "()()()()()()()";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "(()()()()()())";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "(((()())()())((())))";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "(((((()";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "()()(()()()))";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = null;
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		
		str = "{[()]}";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "{[()]})";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "({[()]})";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "{[(&)]})";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "[()]})";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "{{{{{[()]})";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "({[()]})()";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "({[()]})()";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = "";
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		str = null;
		System.out.println(str);
		System.out.println(checkParenthesisSingleType(str));
		
	}

}

/* output

((((()))))
true
()()()()()()()
true
(()()()()()())
true
(((()())()())((())))
true
(((((()
false
()()(()()()))
false

false
null
false
{[()]}
false
{[()]})
false
({[()]})
false
{[(&)]})
false
[()]})
false
{{{{{[()]})
false
({[()]})()
false
({[()]})()
false

false
null
false


*/