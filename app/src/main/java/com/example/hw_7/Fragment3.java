package com.example.hw_7;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Fragment3 extends Fragment {
    FragmentFunctions functions;
    WebView webView;
    String url;

    public Fragment3(String url) {
        this.url = url;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    functions = (FragmentFunctions) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_3, container, false);
        webView = view.findViewById(R.id.webView);
        showWebView(url);
        return view;
    }

    private void showWebView(String url) {
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, url);
            }
        });
    }
}