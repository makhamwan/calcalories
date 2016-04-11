package th.bku.apichaya.calcalories.model;

/**
 * Created by makham on 9/4/2559.
 */
public class Exercise implements calories_list{
    private int cal;
    private String name;
    public Exercise(int cal){
        this.cal = cal;
        this.name = "Quick add";
    }

    public Exercise(int cal , String name){
        this.cal = cal;
        this.name = name;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public int getCal() {
        return cal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Exercise getItem() {
        return this;
    }

}
