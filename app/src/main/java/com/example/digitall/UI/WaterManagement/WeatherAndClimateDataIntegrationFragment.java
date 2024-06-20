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
import com.example.digitall.databinding.WeatherAndClimateDataIntegrationFragmentBinding;

public class WeatherAndClimateDataIntegrationFragment extends DialogFragment {
    WeatherAndClimateDataIntegrationFragmentBinding weatherAndClimateDataIntegrationFragmentBinding;
    public static WeatherAndClimateDataIntegrationFragment newInstance() {
        return new WeatherAndClimateDataIntegrationFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        weatherAndClimateDataIntegrationFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.weather_and_climate_data_integration_fragment, container,false);
        View weatherview = weatherAndClimateDataIntegrationFragmentBinding.getRoot();
        return weatherview;
    }
}
