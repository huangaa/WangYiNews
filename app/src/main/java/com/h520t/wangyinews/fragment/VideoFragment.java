package com.h520t.wangyinews.fragment;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.h520t.wangyinews.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends Fragment {

    @SuppressLint("ValidFragment")
    private VideoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_video, container, false);
    }

    public static VideoFragment newsInstance(){
        return VideoFragmentHolder.sVideoFragment;
    }

    private static class VideoFragmentHolder{
        private static final VideoFragment sVideoFragment = new VideoFragment();
    }

}
