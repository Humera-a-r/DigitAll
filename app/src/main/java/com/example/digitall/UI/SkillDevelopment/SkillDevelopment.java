package com.example.digitall.UI.SkillDevelopment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.SkilldevelopmentFragmentBinding;

public class SkillDevelopment extends DialogFragment {
    SkilldevelopmentFragmentBinding skilldevelopmentFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        skilldevelopmentFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.skilldevelopment_fragment, container, false);
        View skillView = skilldevelopmentFragmentBinding.getRoot();
        return skillView;
    }
}
