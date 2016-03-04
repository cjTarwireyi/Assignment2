import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/03.
 */
public class TestMethods {
    TestDrivenClass td = new TestDrivenClass();
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testIntValues() throws Exception {

        int n;

        Assert.assertEquals(td.INtNum(),8);
    }

    @Test
    public void testDoubleNum() throws Exception {

       Assert.assertEquals(td.dbNum(),5.0);
    }

    @Test
    public void testObjectsEquality() throws Exception {
        String name1=new String("a");
        String name2=new String("a");
        Assert.assertEquals(name1,name2);

    }

    @Test
    public void testObjectIdentity() throws Exception {

        String name1=new String("l");
        String name2= name1;
        Assert.assertSame(name1,name2);
    }

    @Test
    public void testTruth() throws Exception {
        Assert.assertTrue(td.getTruth());
    }

    @Test
    public void testFalse() throws Exception {
        Assert.assertFalse(td.getFalse());
    }

    @Test
    public void testNullness() throws Exception {
            Assert.assertNull(td.getName());
    }

    @Test
    public void testNulless() throws Exception {
        Assert.assertNotNull(td.getSurname());

    }
}
