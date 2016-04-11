package th.bku.apichaya.calcalories.model;

/**
 * Created by makham on 9/4/2559.
 */
public class Food implements calories_list{
    private int cal;
    private String name;
    public Food(int cal){
        this.cal = cal;
        this.name = "Quick add";
    }
    public Food(int cal , String name) {
        this.cal = cal;
        this.name = name;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Food getItem() {
        return this;
    }
}

