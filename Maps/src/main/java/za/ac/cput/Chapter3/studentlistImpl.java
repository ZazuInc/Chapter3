package za.ac.cput.Chapter3;
/**
 * Created by zazu on 2/20/15.
 */
import java.awt.*;
import java.util.*;

public class studentlistImpl implements studentList {
    @Override
    public void add(String studentNr,String studentName){

        studentMap.put(studentNr,studentNr);
    }

    @Override
    public String displayStud() {
        return studentMap.toString();
    }


}
