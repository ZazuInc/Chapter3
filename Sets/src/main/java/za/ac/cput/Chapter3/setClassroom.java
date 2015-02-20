package za.ac.cput.Chapter3;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zazu on 2/20/15.
 */
public interface setClassroom {
    Set<String> rmlist = new HashSet<String>();
    public void add(String rmName);
    public void remove(String rmName);
    public String display();
}
