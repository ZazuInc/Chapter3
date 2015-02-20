package za.ac.cput.Chapter3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class setClassroomImplTest {

    setClassroom clas;

    @Before
    public void setUp() throws Exception {
        clas = new setClassroomImpl();
        clas.add("Science lab");

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {
        Assert.assertEquals("Science lab",clas.display());

    }

    @Test
    public void testRemove() throws Exception {

    }

    @Test
    public void testDisplay() throws Exception {

    }
}