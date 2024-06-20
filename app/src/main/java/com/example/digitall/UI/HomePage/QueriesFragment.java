package com.example.digitall.UI.HomePage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.QueriesFragmentBinding;

public class QueriesFragment extends DialogFragment {
    QueriesFragmentBinding queriesFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        queriesFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.queries_fragment, container, false);
        View queriesView = queriesFragmentBinding.getRoot();

        return queriesView;
    }
}
