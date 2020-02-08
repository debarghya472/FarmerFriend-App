package com.example.farmerfriendapp.ui.login;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.farmerfriendapp.R;


public class LoginFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView;

        if (!CheckNetwork.isNetworkConnected(requireContext())) {
            Toast.makeText(requireContext(), "No Internet Connection!!!", Toast.LENGTH_LONG).show();
             rootView = inflater.inflate(R.layout.fragment_no_internet, container, false);
            return rootView;
        } else {
            rootView = inflater.inflate(R.layout.fragment_login, container, false);
            return rootView;
        }
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (!CheckNetwork.isNetworkConnected(requireContext())) {
            Toast.makeText(requireContext(), "No Internet Connection!!!", Toast.LENGTH_LONG).show();
        } else {
            WebView login = view.findViewById(R.id.webview);
            login.loadUrl("https://www.google.com");
            WebSettings webSettings = login.getSettings();
            webSettings.setJavaScriptEnabled(true);
        }
  }
}

