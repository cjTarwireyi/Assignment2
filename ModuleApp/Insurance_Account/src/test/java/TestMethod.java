import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 3/5/16.
 */
public class TestMethod {
    Insurance ins= new Insurance();
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testGetAmount() throws Exception {
        Assert.assertTrue(ins.getAmount()==400.00);
    }
}
