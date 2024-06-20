package com.example.digitall.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.UI.AgriTech.AdministrationFragment;
import com.example.digitall.UI.AgriTech.FarmManagementFragment;
import com.example.digitall.UI.AgriTech.TechnologyFragment;
import com.example.digitall.UI.WaterManagement.RealTimeDataCollectionFragment;
import com.example.digitall.UI.WaterManagement.ResourceManagementOptimizationFragment;
import com.example.digitall.UI.WaterManagement.SensorNetworkFragment;
import com.example.digitall.UI.WaterManagement.VisualizationAndAnalysisFragment;
import com.example.digitall.UI.WaterManagement.WeatherAndClimateDataIntegrationFragment;
import com.example.digitall.databinding.WatermanagmentFragmentBinding;

public class WaterManagmentFragment extends DialogFragment implements View.OnClickListener {
    WatermanagmentFragmentBinding watermanagmentFragmentBinding;
    private Button Sensorbtn;
    private Button RealtimeDataCollection;
    private Button WeatherClimateData;
    private Button visualizationbtn;
    private Button ResourseManagement;


    public static WaterManagmentFragment newInstance(){
        return new WaterManagmentFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        watermanagmentFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.watermanagment_fragment, container, false);
        View managementView = watermanagmentFragmentBinding.getRoot();
        configureViewFinding();
        return managementView;
    }
    private void configureViewFinding() {
        AppCompatImageView imageBack = watermanagmentFragmentBinding.imageBack;
        imageBack.setOnClickListener(v -> dismiss());
        Sensorbtn  = watermanagmentFragmentBinding.Sensorbtn;
        Sensorbtn.setOnClickListener(this);
        RealtimeDataCollection  = watermanagmentFragmentBinding.RealtimeDataCollection;
        RealtimeDataCollection.setOnClickListener(this);
        WeatherClimateData  = watermanagmentFragmentBinding.WeatherClimateData;
        WeatherClimateData.setOnClickListener(this);
        visualizationbtn  = watermanagmentFragmentBinding.visualizationbtn;
        visualizationbtn.setOnClickListener(this);
        ResourseManagement  = watermanagmentFragmentBinding.ResourseManagement;
        ResourseManagement.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == Sensorbtn.getId()){
            DialogFragment sensor = SensorNetworkFragment.newInstance();
            sensor.setArguments(new Bundle());
            sensor.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            sensor.show(getChildFragmentManager(), "Sensor Network Fragment");
        } else if (view.getId() == RealtimeDataCollection.getId()) {
            DialogFragment realtimedata = RealTimeDataCollectionFragment.newInstance();
            realtimedata.setArguments(new Bundle());
            realtimedata.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            realtimedata.show(getChildFragmentManager(), "Real time data collection");

        }else if (view.getId() == WeatherClimateData.getId()) {
            DialogFragment weatherdata = WeatherAndClimateDataIntegrationFragment.newInstance();
            weatherdata.setArguments(new Bundle());
            weatherdata.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            weatherdata.show(getChildFragmentManager(), "Weather climate Module");

        }else if (view.getId() == visualizationbtn.getId()) {
            DialogFragment visualization = VisualizationAndAnalysisFragment.newInstance();
            visualization.setArguments(new Bundle());
            visualization.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            visualization.show(getChildFragmentManager(), "Visualization");

        }else if (view.getId() == ResourseManagement.getId()) {
            DialogFragment resouce = ResourceManagementOptimizationFragment.newInstance();
            resouce.setArguments(new Bundle());
            resouce.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            resouce.show(getChildFragmentManager(), "optimization Module");

        }

    }
}
