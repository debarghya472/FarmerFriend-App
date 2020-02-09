package com.example.farmerfriendapp.ui.home;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;


import com.example.farmerfriendapp.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<Image> imagelist = new ArrayList<Image>();
        imagelist.add(new Image(R.drawable.ab,"red chilly"));
        imagelist.add(new Image(R.drawable.b1,"Pomo"));
        imagelist.add(new Image(R.drawable.b3,"Green tomatoes"));

        Home_Adapter adapter = new Home_Adapter(getActivity(), imagelist);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
