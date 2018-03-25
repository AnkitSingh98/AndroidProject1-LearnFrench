package org.learn.dellse.learnfrench;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.ankithacks.learnfrench.R;

import java.util.ArrayList;

/**
 * Created by DellSe on 04-11-2016.
 */
public class contentsAdapter extends ArrayAdapter<contents> {

    public contentsAdapter(Context context, ArrayList<contents> contents) {
        super(context, 0, contents);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView =convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.numbers_list, parent, false);
        }
        contents pos=getItem(position);
        TextView t1=(TextView)listItemView.findViewById(R.id.text1);
        t1.setText(pos.getcont());
        TextView t2=(TextView)listItemView.findViewById(R.id.text3);
        t2.setText(pos.getMImageId());

        return listItemView;
    }
}
