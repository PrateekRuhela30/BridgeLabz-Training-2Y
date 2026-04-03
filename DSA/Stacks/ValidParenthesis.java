import java.util.*;

class ValidParenthesis {

    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(char c : s.toCharArray()){

            if(c == '(' || c == '[' || c == '{'){
                stk.push(c);
            }

            else if(c == ')' || c == ']' || c == '}'){

                if(stk.isEmpty()){
                    return false;
                }

                if(c == '}' && stk.peek() != '{' ||
                   c == ')' && stk.peek() != '(' ||
                   c == ']' && stk.peek() != '['){
                    return false;
                }
                else{
                    stk.pop();
                }
            }
        }

        return stk.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        ValidParenthesis obj = new ValidParenthesis();

        boolean result = obj.isValid(s);

        if(result){
            System.out.println("Valid Parenthesis");
        } else {
            System.out.println("Invalid Parenthesis");
        }

        sc.close();
    }
}