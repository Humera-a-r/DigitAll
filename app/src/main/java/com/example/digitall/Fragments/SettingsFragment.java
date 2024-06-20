package com.example.digitall.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.SettingsFragmentBinding;

public class SettingsFragment extends DialogFragment {
    SettingsFragmentBinding settingsFragmentBinding;

    public static SettingsFragment newInstance(){
        return new SettingsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        settingsFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.settings_fragment, container, false);
        View settingsView = settingsFragmentBinding.getRoot();
        configureViewFinding();
        return settingsView;
    }
    private void configureViewFinding() {
        AppCompatImageView imageBack = settingsFragmentBinding.imageBack;
        imageBack.setOnClickListener(v -> dismiss());
    }
}
