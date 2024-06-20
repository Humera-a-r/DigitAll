package com.example.digitall.UI.Updates;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.UpdatesFragmentBinding;

public class UpdatesFragment extends DialogFragment {
    UpdatesFragmentBinding updatesFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        updatesFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.updates_fragment, container, false);
        View updateView = updatesFragmentBinding.getRoot();
        return updateView;
    }
}
