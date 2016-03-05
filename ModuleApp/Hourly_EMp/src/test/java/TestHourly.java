import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 3/5/16.
 */
public class TestHourly {
    Hourly he = new Hourly();
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testgetHours() throws Exception {
        Assert.assertEquals(he.getHrs(),40);
    }

    @Test
    public void testGetRate() throws Exception {
        Assert.assertTrue(he.getRate()==25);

    }

    @Test
    public void testCalcSal() throws Exception {

        Assert.assertTrue(he.calcSal()>0);
    }
}
