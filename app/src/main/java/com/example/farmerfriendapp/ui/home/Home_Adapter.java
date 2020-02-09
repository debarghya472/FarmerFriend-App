package com.example.farmerfriendapp.ui.home;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.farmerfriendapp.R;

import java.util.ArrayList;

public class Home_Adapter extends ArrayAdapter<Image> {
    public Home_Adapter(Activity context, ArrayList<Image> imagelist)
    {
    super(context,0,imagelist);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Image locator= getItem(position);
        ImageView ima= (ImageView) listItemView.findViewById(R.id.list_item_image);
        ima.setImageResource(locator.getImageid());
        TextView des=(TextView) listItemView.findViewById(R.id.list_item_des);
        des.setText(locator.getHdes());
        return  listItemView;
    }
}
