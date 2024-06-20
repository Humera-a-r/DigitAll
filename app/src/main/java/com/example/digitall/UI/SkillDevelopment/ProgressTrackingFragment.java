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
import com.example.digitall.databinding.ProgressTrackingFragmentBinding;

public class ProgressTrackingFragment extends DialogFragment {
    ProgressTrackingFragmentBinding progressTrackingFragmentBinding;
    public static ProgressTrackingFragment newInstance() {
        return new ProgressTrackingFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        progressTrackingFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.progress_tracking_fragment, container,false);
        View progressview = progressTrackingFragmentBinding.getRoot();
        return progressview;
    }
}
