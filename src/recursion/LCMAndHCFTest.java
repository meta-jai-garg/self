package recursion;

import org.junit.Assert;
import org.junit.Test;

public class LCMAndHCFTest {
    @Test
    public void findLCM() {
        Assert.assertEquals("Failure", 18, LCMAndHCF.findLCM(6, 9));
    }

    @Test
    public void findHCF() {
        Assert.assertEquals("Failure", 12, LCMAndHCF.findHCF(24, 36));
    }
}
