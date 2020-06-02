package stack;

public class LinkedListDemo {
    public static void main(String[] args) {
        PostFIx postFIx  = new PostFIx() ;

       // try {
          //  postFIx.UI();
        //} catch (Underflow e) {
         //   e.printStackTrace();
       // } catch (Overflow x ) {
         //   x.printStackTrace();
       // }
        try {
            postFIx.infixToPostfix("1+2*3");
        } catch (Overflow e ) {
            e.printStackTrace();
        } catch (Underflow x ) {
            x.printStackTrace();
        }

        }

        }

