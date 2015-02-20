package za.ac.cput.Chapter3;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class studentListTest {
    studentList sList;
@Before
    public void setUp() throws Exception{

        sList = new studentlistImpl();
        sList.add("207068577", "Zazu");
    }

    @Test
    public void testsList() throws Exception{
        Assert.assertEquals("{207068577,Zazu}",sList.displayStud());
    }

    @After
    public void tearDown() throws Exception{

    }


}