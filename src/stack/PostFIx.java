package stack;

import java.util.Iterator;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

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
        return result ;
    }


    public void infixToPostfix (String ifx) {
        String output="" ;
         for (int i = 0 ; i<ifx.length(); i++) {
             System.out.println("length is : "+ifx.length());
             System.out.println("i is "+ i);
           char t = ifx.charAt(i);
           if ((t>= '0') && (t<= '9')) {
               System.out.println("t is a number");
               stack.push(t);
               System.out.println(t + " is pushed");
           } else if ((t == '+') || (t == '-') || (t =='*') || (t == '/') || (t == '^')) {
                if (stack.isEmpty()) {
                    System.out.println("stack is empty");
                    stack.push(t);
                    System.out.println(t + "is pushed");
                } else {
                    System.out.println("What you re looking at " + stack.top().toString());{
                       String wut = String.valueOf(stack.pop());
                       System.out.println( "stack isn't empty and your variable is "+ wut);
                       output =  output .concat(wut);
                       System.out.println("output : "+ output);
                   }
                    stack.push(t);
                    System.out.println(t+"is pushed");
                }
           }
             System.out.println("t is "+ t);
           }
                while(!stack.isEmpty()) {
                    output = output .concat(String.valueOf(stack.pop())) ;
                }
        System.out.println("your output is "+output);
    }


    public void UI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your postfix expression : ");
        String PostFix = scanner.nextLine();
        System.out.println(evaluate(PostFix));
    }
}
