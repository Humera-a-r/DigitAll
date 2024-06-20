package com.example.digitall.UI.Telehealth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.TelehealthFragmentBinding;

public class TelehealthFragment extends DialogFragment {
    TelehealthFragmentBinding telehealthFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        telehealthFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.telehealth_fragment, container,false);
        View telehealthView = telehealthFragmentBinding.getRoot();
        return telehealthView;
    }
}
