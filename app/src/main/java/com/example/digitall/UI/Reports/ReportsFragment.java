package com.example.digitall.UI.Reports;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.ReportsFragmentBinding;

public class ReportsFragment extends DialogFragment {
    ReportsFragmentBinding reportsFragmentBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        reportsFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.reports_fragment, container, false);
        View reportsView = reportsFragmentBinding.getRoot();
        return reportsView;
    }
}
