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
import com.example.digitall.databinding.RealTimeDataCollectionFragmentBinding;

public class RealTimeDataCollectionFragment extends DialogFragment {
    RealTimeDataCollectionFragmentBinding realTimeDataCollectionFragmentBinding;
    public static RealTimeDataCollectionFragment newInstance() {
        return new RealTimeDataCollectionFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        realTimeDataCollectionFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.real_time_data_collection_fragment, container,false);
        View realview = realTimeDataCollectionFragmentBinding.getRoot();
        return realview;
    }
}
