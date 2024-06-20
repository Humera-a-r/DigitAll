package com.example.digitall.UI.WaterManagement;

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
import com.example.digitall.databinding.ResourceManagementOptimizationFragmentBinding;

public class ResourceManagementOptimizationFragment extends DialogFragment {
    ResourceManagementOptimizationFragmentBinding resourceManagementOptimizationFragmentBinding;
    public static ResourceManagementOptimizationFragment newInstance() {
        return new ResourceManagementOptimizationFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        resourceManagementOptimizationFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.resource_management_optimization_fragment, container,false);
        View resourceview = resourceManagementOptimizationFragmentBinding.getRoot();
        return resourceview;
    }
}
