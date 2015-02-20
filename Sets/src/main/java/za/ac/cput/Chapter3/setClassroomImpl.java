package za.ac.cput.Chapter3;
/**
 * Created by zazu on 2/20/15.
 */
public class setClassroomImpl implements setClassroom {


    @Override
    public void add(String rmName) {
        Object room = rmlist.add( new String (rmName) );
        if ( room == null )
            System.out.println( "Classroom not add " + room );
        else
        {
            System.out.println( "Classroom added " + room );

        }


    }

    @Override
    public void remove(String rmName) {
        rmlist.remove(rmName);

    }

    @Override
    public String display() {
        return rmlist.toString();

    }
}
