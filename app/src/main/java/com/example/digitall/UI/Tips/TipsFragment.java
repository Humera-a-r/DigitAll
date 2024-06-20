package com.example.digitall.UI.Tips;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.TipsFragmentBinding;

public class TipsFragment extends DialogFragment {
    TipsFragmentBinding tipsFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tipsFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.tips_fragment, container, false);
        View tipsView = tipsFragmentBinding.getRoot();
        return tipsView;
    }
}
