package com.example.hw_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentFunctions{
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendFragment() {
        fragmentManager = getSupportFragmentManager();
        Fragment1 fragment1 = new Fragment1();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content3, fragment1);
        fragmentTransaction.commit();

    }

    @Override
    public void hideFragment() {
        fragmentManager = getSupportFragmentManager();
        assert getFragmentManager() != null;
        Fragment2 fragment2 = new Fragment2();
        fragmentManager.beginTransaction()
                .hide(fragment2).add(R.id.content2, new Fragment1()).commit();


    }

    @Override
    public void openUrl() {

    }
}