package com.example.yuan.demodiaryapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yuan.demodiaryapp.R;

/**
 * 日记记录
 * Created by yuan on 2017/11/12.
 */

public class WriteDiaryFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.write_diary, container, false);
        return view;
    }
}
