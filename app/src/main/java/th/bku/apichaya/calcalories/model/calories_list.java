package th.bku.apichaya.calcalories.model;

/**
 * Created by makham on 11/4/2559.
 */
public interface calories_list {
    int cal = 0;
    String name = "Quick add";
    public int getCal();
    public void setCal(int cal);
    public String getName();
    public void setName(String name);
    public calories_list getItem();
}
