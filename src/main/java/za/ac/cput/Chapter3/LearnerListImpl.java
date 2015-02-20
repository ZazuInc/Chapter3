package za.ac.cput.Chapter3;

/**
 * Created by zazu on 2/20/15.
 */
public class LearnerListImpl implements LearnerList {
@Override
    public void add(String rmName)
{
    Object room = rmlist.add( new String (rmName) );
    if ( room == null )
        System.out.println( "Classroom not add " + room );
    else
    {
        System.out.println( "Classroom added " + room );

    }

    }
    @Override
    public void remove(String rmName){
        rmlist.remove(rmName);


    }
    @Override

    public String diplay(){
        return rmlist.toString();

    }
    //**************************************
    @Override

    public void addList(String sub){
        subList.add(sub);


    }
    @Override

    public void removeList(String sub) {
        boolean found = false;

        for (int i = 0; i < subList.size(); i++) {
            if (sub == subList.get(i)) {
                found = true;
                subList.remove(i);
            } else if (found == false) ;
        }


    }
    @Override

    public String diplayList(){return subList.toString();

    }
    //***********************************************************
    public void add(String studentNr, String studentName){

        studentMap.put(studentNr,studentNr);


    }
    @Override

    public String diplayStud(){
        return studentMap.toString();


    }


}
