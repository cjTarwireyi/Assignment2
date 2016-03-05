import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 3/5/16.
 */
public class TestSalaried {
    Salaried se = new Salaried();
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testSalariedMethod() throws Exception {
        Assert.assertTrue(se.getMonthly()>3000 && se.getMonthly()<10000);
    }

    @Test
    public void testCalcGrossSal() throws Exception {
        Assert.assertEquals(60000.00,se.calcGrossSal());
    }
}
