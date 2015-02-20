package za.ac.cput.Chapter3;
        /**
 * Created by zazu on 2/20/15.
 */


public class subjectListImp implements subjectList{

    @Override

    public void addList(String sub)
    {
        subList.add(sub);



    }

            @Override
            public void removeList(String sub) {
                boolean found = false;

                for (int i=0;i< subList.size();i++){
                    if (sub==subList.get(i))
                    {
                        found= true;
                        subList.remove(i);
                    }else
                        if(found ==false);
                }
            }

            @Override
            public String diplayList() {
                return subList.toString();
            }


        }
