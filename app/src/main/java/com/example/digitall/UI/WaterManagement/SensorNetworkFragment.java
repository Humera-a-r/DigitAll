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
import com.example.digitall.databinding.SensorNetworkFragmentBinding;

public class SensorNetworkFragment extends DialogFragment {
    SensorNetworkFragmentBinding sensorNetworkFragmentBinding;
    public static SensorNetworkFragment newInstance() {
        return new SensorNetworkFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        sensorNetworkFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.sensor_network_fragment, container,false);
        View sensorview = sensorNetworkFragmentBinding.getRoot();
        return sensorview;
    }
}
