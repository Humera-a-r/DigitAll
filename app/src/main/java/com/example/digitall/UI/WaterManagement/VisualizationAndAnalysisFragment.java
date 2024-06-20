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
import com.example.digitall.databinding.VisualizationAndAnalysisFragmentBinding;

public class VisualizationAndAnalysisFragment extends DialogFragment {
    VisualizationAndAnalysisFragmentBinding visualizationAndAnalysisFragmentBinding;
    public static VisualizationAndAnalysisFragment newInstance() {
        return new VisualizationAndAnalysisFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        visualizationAndAnalysisFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.visualization_and_analysis_fragment, container,false);
        View visualizeview = visualizationAndAnalysisFragmentBinding.getRoot();
        return visualizeview;
    }
}
