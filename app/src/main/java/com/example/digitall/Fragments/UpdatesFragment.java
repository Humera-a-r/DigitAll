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
import com.example.digitall.databinding.UpdatesFragmentBinding;

public class UpdatesFragment extends DialogFragment {
    UpdatesFragmentBinding updatesFragmentBinding;

    public static UpdatesFragment newInstance(){
        return new UpdatesFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        updatesFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.updates_fragment, container, false);
        View updateView = updatesFragmentBinding.getRoot();
        configureViewFinding();
        return updateView;
    }
    private void configureViewFinding() {
        AppCompatImageView imageBack = updatesFragmentBinding.imageBack;
        imageBack.setOnClickListener(v -> dismiss());
    }
}
