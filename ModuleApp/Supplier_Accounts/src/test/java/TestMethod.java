import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 3/5/16.
 */
public class TestMethod {
    SupplierAccount sa = new SupplierAccount();
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCalcAmount() throws Exception {
        Assert.assertTrue(sa.calcAmount()>2000);

    }
}
