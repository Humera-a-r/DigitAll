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
import com.example.digitall.UI.SupplyChain.CommunicateWithConsumerFragment;
import com.example.digitall.databinding.LearningPathFragmentBinding;

public class LearningPathFragment extends DialogFragment {
    LearningPathFragmentBinding learningPathFragmentBinding;
    public static LearningPathFragment newInstance() {
        return new LearningPathFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        learningPathFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.learning_path_fragment, container,false);
        View learnview = learningPathFragmentBinding.getRoot();
        return learnview;
    }
}
