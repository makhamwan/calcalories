package th.bku.apichaya.calcalories.model;

/**
 * Created by makham on 8/4/2559.
 */
public class Calories {
    private int cal;
    public Calories(int cal){
        this.cal = cal;
    }
    public int getCal(){
        return this.cal;
    }
    public void setCal(int n){
        this.cal = n;
    }
}
