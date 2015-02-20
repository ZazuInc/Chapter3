package za.ac.cput.Chapter3;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zazu on 2/20/15.
 */
public interface subjectList {
    List<String> subList = new ArrayList<String>();

    public void addList(String sub );
    public void removeList(String sub);
    public String diplayList();
}
