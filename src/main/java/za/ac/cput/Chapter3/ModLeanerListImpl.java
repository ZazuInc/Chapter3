package za.ac.cput.Chapter3;

/**
 * Created by zazu on 2/20/15.
 */

//import za.ac.cput.learnerList.*;

public class ModLeanerListImpl implements LearnerList {

    private setClassroom roomMod= new setClassroomImpl();
    private studentList studentMod = new studentListImpl();
    private subjectList subjectMod = new subjectListImpl();


    @Override
    public void add(String sub) {

    }

    @Override
    public void remove(String sub) {

    }

    @Override
    public String diplay() {
        return null;
    }

    @Override
    public void addList(String sub) {

    }

    @Override
    public void removeList(String sub) {

    }

    @Override
    public String diplayList() {
        return null;
    }

    @Override
    public void add(String studentNr, String studentName) {

    }

    @Override
    public String diplayStud() {
        return null;
    }
}
