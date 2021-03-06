package com.example.chapter3.demo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chapter3.demo.R;

/**
 * @author yangjie
 * @date 2019-06-26
 */
public class FragmentB extends Fragment {
    private static final String TAG = "FragmentB";

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.v(TAG,"<-----onAttach----->");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG,"<-----onCreate----->");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.v(TAG,"<-----onCreateView----->");
        return inflater.inflate(R.layout.frame_layout_b,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Log.v(TAG,"<-----onViewCreated----->");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v(TAG,"<-----onActivityCreated----->");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v(TAG,"<-----onStart----->");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v(TAG,"<-----onResume----->");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v(TAG,"<-----onPause----->");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v(TAG,"<-----onStop----->");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.v(TAG,"<-----onDestroyView----->");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v(TAG,"<-----onDestroy----->");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v(TAG,"<-----onDetach----->");
    }
}
