package com.example.farmerfriendapp.ui.home;

import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.farmerfriendapp.R;

public class HomeFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        EditText quant1 = (EditText) view.findViewById(R.id.quantity1);
        EditText quant2 = (EditText) view.findViewById(R.id.quantity2);
        EditText quant3 = (EditText) view.findViewById(R.id.quantity3);
        EditText quant4 = (EditText) view.findViewById(R.id.quantity4);
        EditText quant5 = (EditText) view.findViewById(R.id.quantity5);
        EditText quant6 = (EditText) view.findViewById(R.id.quantity6);
        EditText quant7 = (EditText) view.findViewById(R.id.quantity7);
        EditText quant8 = (EditText) view.findViewById(R.id.quantity8);
        EditText quant9 = (EditText) view.findViewById(R.id.quantity9);
        EditText quant10 = (EditText) view.findViewById(R.id.quantity10);
        EditText quant11 = (EditText) view.findViewById(R.id.quantity11);

        EditText pri1 =(EditText) view.findViewById(R.id.price1);
        EditText pri2 =(EditText) view.findViewById(R.id.price2);
        EditText pri3 =(EditText) view.findViewById(R.id.price3);
        EditText pri4 =(EditText) view.findViewById(R.id.price4);
        EditText pri5 =(EditText) view.findViewById(R.id.price5);
        EditText pri6 =(EditText) view.findViewById(R.id.price6);
        EditText pri7 =(EditText) view.findViewById(R.id.price7);
        EditText pri8 =(EditText) view.findViewById(R.id.price8);
        EditText pri9 =(EditText) view.findViewById(R.id.price9);
        EditText pri10 =(EditText) view.findViewById(R.id.price10);
        EditText pri11 =(EditText) view.findViewById(R.id.price11);



//        String stpri1 = pri1.getText().toString();
//        String stpri2 = pri2.getText().toString();
//        String stpri3 = pri3.getText().toString();
//        String stpri4 = pri4.getText().toString();
//        String stpri5 = pri5.getText().toString();
//        String stpri6 = pri6.getText().toString();
//        String stpri7 = pri7.getText().toString();
//        String stpri8 = pri8.getText().toString();
//        String stpri9 = pri9.getText().toString();
//        String stpri10 = pri10.getText().toString();
//        String stpri11 = pri11.getText().toString();

//        String stqua1 = quant1.getText().toString();
//        String stqua2 = quant2.getText().toString();
//        String stqua3 = quant3.getText().toString();
//        String stqua4 = quant4.getText().toString();
//        String stqua5 = quant5.getText().toString();
//        String stqua6 = quant6.getText().toString();
//        String stqua7 = quant7.getText().toString();
//        String stqua8 = quant8.getText().toString();
//        String stqua9 = quant9.getText().toString();
//        String stqua10 = quant10.getText().toString();
//        String stqua11 = quant11.getText().toString();

        TextView callp1 =  (TextView) view.findViewById(R.id.p1);
        TextView callp2 = (TextView) view.findViewById(R.id.p2);
        TextView callp3 = (TextView) view.findViewById(R.id.p3);
        TextView callp4 = (TextView) view.findViewById(R.id.p4);
        TextView callp5 = (TextView) view.findViewById(R.id.p5);
        TextView callp6 = (TextView) view.findViewById(R.id.p6);
        TextView callp7 = (TextView) view.findViewById(R.id.p7);
        TextView callp8 = (TextView) view.findViewById(R.id.p8);
        TextView callp9 = (TextView) view.findViewById(R.id.p9);
        TextView callp10 = (TextView) view.findViewById(R.id.p10);
        TextView callp11 = (TextView) view.findViewById(R.id.p11);

//        callp1.setText(stpri1);
//        callp2.setText(stpri2);
//        callp3.setText(stpri3);
//        callp4.setText(stpri4);
//        callp5.setText(stpri5);
//        callp6.setText(stpri6);
//        callp7.setText(stpri7);
//        callp8.setText(stpri8);
//        callp9.setText(stpri9);
//        callp10.setText(stpri10);
//        callp11.setText(stpri11);
   return view;
  }
}
