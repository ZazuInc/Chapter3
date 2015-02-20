package za.ac.cput.Chapter3;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by zazu on 2/20/15.
 */



public interface studentList {
    Map<Object,String> studentMap = new LinkedHashMap<Object, String>();

    public void add(String studentNr, String studentName);
    public String displayStud();


}

