package stack;

import static org.junit.jupiter.api.Assertions.*;

class PostFIxTest {

    @org.junit.jupiter.api.Test
    void evaluate() {
        PostFIx postFIx = new PostFIx() ;
        try {
            int result = postFIx.evaluate("123*+");
            assertEquals(7,result );
        } catch (Overflow x ) {
            x.printStackTrace();
        } catch (Underflow e) {
            e.printStackTrace();
        }
        }
}