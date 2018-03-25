package org.learn.dellse.learnfrench;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.ankithacks.learnfrench.R;

import java.util.ArrayList;

/**
 * Created by DellSe on 07-11-2016.
 */
public class frontAdapter extends ArrayAdapter<front> {

    public frontAdapter(Context context, ArrayList<front> front) {
        super(context, 0, front);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView =convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.frontpage, parent, false);
        }
        front pos=getItem(position);

        TextView t1=(TextView)listItemView.findViewById(R.id.text);
        t1.setText(pos.getcont());
        ImageView i=(ImageView)listItemView.findViewById(R.id.image);
        i.setImageResource(pos.getMImageId());
        return listItemView;
    }
}
