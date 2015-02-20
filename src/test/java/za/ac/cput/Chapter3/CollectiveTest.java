package za.ac.cput.Chapter3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zazu on 2/20/15.
 */
public class CollectiveTest {private LearnerList learners;
    private ApplicationContext text;


        @Before
        public void setUp() throws Exception {
            text = new AnnotationConfigApplicationContext(Config.class);
            learners = (LearnerList)text.getBean("stud");
        }
    @Test
    public void testsList() throws Exception{
        studentList sList;
        Assert.assertEquals("{207068577,Zazu}",sList.displayStud());
    }
    @Test
    public void testAdd() throws Exception {
        setClassroom clas;
        Assert.assertEquals("Science lab", clas.display());
    }
    @Test
    public void testAdd() throws Exception {
        subjectList bList;
        Assert.assertEquals("Mathematics",bList.diplayList());

    }

}
