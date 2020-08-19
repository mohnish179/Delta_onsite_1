package com.example.task_1;

import android.graphics.Path;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_2 extends Fragment {


    CustomView2 mc;
    private static final String TAG = "Fragment_2";
    Path path=null;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);


        mc=view.findViewById(R.id.c2);

        return view;


    }

    public void getpath(Path p)
    {
        path=p;
        mc.dr(path);
        Log.d(TAG, "getpath: "+path);
    }




}
