package com.example.farmerfriendapp.ui.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.farmerfriendapp.MainActivity;
import com.example.farmerfriendapp.R;


public class LoginFragment extends Fragment {
    View rootView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        rootView=inflater.inflate(R.layout.fragment_login,container,false);
        Button click=(Button) rootView.findViewById(R.id.password_button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit=(EditText)rootView.findViewById(R.id.user_login);
                String smsNumber = edit.getText().toString();

                Uri uri = Uri.parse("smsto:" + smsNumber);
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Your password is:");
                startActivity(intent);
            }
        });
        return rootView;


    }



    }


