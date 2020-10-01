package com.example.hw_7;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment1 extends Fragment {
    private FragmentFunctions functions;
    private Button btnSend, btnHide;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        functions = (FragmentFunctions) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        btnSend = view.findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                functions.sendFragment();
            }
        });
        btnHide = view.findViewById(R.id.btnHide);
        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                functions.hideFragment();
            }
        });
        return view;
    }
}