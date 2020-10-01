package com.example.hw_7;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Fragment2 extends Fragment {
    public RecyclerView recyclerView;
    public Fragment2_Adapter adapter;
    FragmentActivity fragmentActivity = getActivity();
    public List<String> list;
    private FragmentFunctions functions;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        functions = (FragmentFunctions) context;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        recyclerView = view.findViewById(R.id.recycler);
        list = new ArrayList<String>();
        list.add("https://www.redmouse.pro/motiondesign");
        list.add("http://htmlbook.ru/samhtml/ssylki");
        list.add("http://www.gadget.kg/catalog/gadzhety");
        list.add("https://enter.kg/");
        list.add("https://samsungstore.kg/ru/mobilnye_ustroystva/smartfony/smartfons/i1027/galaxy_s20_ultra");
        list.add("https://www.gmail.com");
        recyclerView.setLayoutManager(new LinearLayoutManager(fragmentActivity));
        adapter = new Fragment2_Adapter(list,fragmentActivity, (FragmentFunctions) getActivity());
        recyclerView.setAdapter(adapter);
        return view;
    }
}