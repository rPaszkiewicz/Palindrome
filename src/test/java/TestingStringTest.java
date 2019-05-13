import org.junit.Assert;
import org.junit.Test;

public class TestingStringTest {

    @Test
        public void PalindromeChecker() {
        String word = "dot";
        String reversed = "";

        for (int i = word.length()-1; i >= 0; i--)
            reversed += word.charAt(i);

        Assert.assertEquals("tod",reversed);
    }

}
