package com.example.digitall.UI.SupplyChain;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.UI.AgriTech.FarmManagementFragment;
import com.example.digitall.databinding.TraceProductFragmentBinding;

public class TraceProductFragment extends DialogFragment {
    TraceProductFragmentBinding traceProductFragmentBinding;
    public static TraceProductFragment newInstance() {
        return new TraceProductFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        traceProductFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.trace_product_fragment, container,false);
        View traceview = traceProductFragmentBinding.getRoot();
        return traceview;
    }
}
