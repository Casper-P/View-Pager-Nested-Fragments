package com.example.casper.myapplication.frags;

import android.support.v4.app.Fragment;

import com.example.casper.myapplication.BackPressImpl;
import com.example.casper.myapplication.OnBackPressListener;

public class RootFragment extends Fragment implements OnBackPressListener {

    @Override
    public boolean onBackPressed() {
        return new BackPressImpl(this).onBackPressed();
    }
}
