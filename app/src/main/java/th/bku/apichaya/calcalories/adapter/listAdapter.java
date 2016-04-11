package th.bku.apichaya.calcalories.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;

import th.bku.apichaya.calcalories.model.calories_list;

/**
 * Created by makham on 11/4/2559.
 */
public class listAdapter extends ArrayAdapter<calories_list> {

    public listAdapter(Context context, int resource, calories_list[] objects) {
        super(context, resource, objects);
    }
}
