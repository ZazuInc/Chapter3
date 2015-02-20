import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Chapter3.subjectList;
import za.ac.cput.Chapter3.subjectListImp;

public class subjectListImpTest {
     subjectList bList;

    @Before
    public void setUp() throws Exception {
        bList=new subjectListImp();
        bList.addList("Mathematics");

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals("Mathematics",bList.diplayList());

    }

    @Test
    public void testRemove() throws Exception {

    }
}