package stack;

import java.util.Iterator;

public class PostFIx {
    LinkedList stack = new LinkedList() ;
    LinkedList stack2 = new LinkedList();

    public int evaluate (String pfx) {

        for (int i =0 ; i<pfx.length() ; i++) {
            char t = pfx.charAt(i);
            if ( (t>= '0') && (t<= '9')) {
                stack.push(t);
            } else if ((t == '+') || (t == '-') || (t =='*') || (t == '/') || (t == '^')) {
             int rhs = Integer.parseInt(String.valueOf(stack.pop())) ;
             System.out.println("Right hand side " + rhs);
             System.out.println("====");
             int lhs = Integer.parseInt(String.valueOf(stack.pop())) ;
             System.out.println("left hand side"+ lhs);
             System.out.println("====");
             System.out.println("calculating " + lhs + t + rhs );
             switch(t) {
                 case '+':
                 stack.push((lhs + rhs));
                 break;
                 case '-':
                     stack.push((lhs-rhs));
                     break ;
                 case '/':
                     stack.push((lhs/rhs));
                     break ;
                 case '*':
                     stack.push((lhs*rhs));
                     break ;
                 case'^':
                     stack.push(lhs^rhs);
                     break ;
             }
            }

        }
        int result = Integer.parseInt(String.valueOf(stack.pop())) ;
        stack.toString();
        return result ;
    }


    public void infixToPostfix (String ifx) {
        String output= null  ;
         for (int i = 0 ; i<ifx.length(); i++) {
           char t = ifx.charAt(i);
           if (t == '(') {
             stack2.push(t);
           } else if ((t == '+') || (t == '-') || (t =='*') || (t == '/') || (t == '^')) {
                if (stack2.isEmpty()) {
                    stack2.push(t);
                } else {
                    while (true) {
                        if (stack2.top().toString().charAt(0)>=t){
                            output += String.valueOf(stack.pop());
                        } else {
                            break;
                        }
                    }
                    stack2.push(t);
                }
           } else if (t == ')') {
               while  ((!stack2.isEmpty()) && (stack2.top().toString().charAt(0)!='(')) {
                   output += String.valueOf(stack.pop());
               }
           } else {
               while  (!stack2.isEmpty()) {
                   output += String.valueOf(stack.pop());
               }
           }
      }
        System.out.println(output);
    }
}
