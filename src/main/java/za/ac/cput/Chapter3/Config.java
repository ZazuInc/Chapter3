package za.ac.cput.Chapter3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zazu on 2/20/15.
 */
@Configuration
public class Config {
    @Bean(name="stud")
    public LearnerList getLearner(){
        return new LearnerListImpl();
    }

    @Bean(name="stud")
    public LearnerList getModLearnerList(){
        return new ModLeanerListImpl();
    }
}
