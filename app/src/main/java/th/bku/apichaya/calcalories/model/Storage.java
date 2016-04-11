package th.bku.apichaya.calcalories.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by makham on 9/4/2559.
 */
public class Storage {
    public static List<Food> listfood;
    public static List<Exercise> listexercise;
    public static Storage instance;

    private Storage(){
        this.listfood = new ArrayList<Food>();
        this.listexercise = new ArrayList<Exercise>();
    }

    public static Storage getInstance(){
        if(instance == null){
            instance = new Storage();
        }
        return instance;
    }

}
