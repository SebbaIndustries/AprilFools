import org.junit.Assert;
import org.junit.Test;

import java.util.Random;
import java.util.logging.Logger;

public class TestCore {

    public Logger log = Logger.getLogger("TestCore");

    @Test
    public void test() {
        int max = 7;
        int min = 1;
        Random rand = new Random();

// nextInt as provided by Random is exclusive of the top value so you need to add 1
        int randomNum = rand.nextInt((max - min) + 1) + min;
        log.info(String.valueOf(randomNum));
        Assert.assertTrue(true);
    }
}
