package za.ac.cput.Chapter3;

import java.util.*;

/**
 * Created by zazu on 2/20/15.
 */
public interface LearnerList {



    Set<String> rmlist = new HashSet<String>();
    List<String> subList = new ArrayList<String>();
    Map<Object,String> studentMap = new LinkedHashMap<Object, String>();


    public void add(String sub);
    public void remove(String sub);
    public String diplay();
    public void addList(String sub);
    public void removeList(String sub);
    public String diplayList();
    public void add(String studentNr, String studentName);
    public String diplayStud();





}
