package com.example.digitall.UI.Telehealth;

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
import com.example.digitall.databinding.EducationResourcesFragmentBinding;

public class EducationResourcesFragment extends DialogFragment {
    EducationResourcesFragmentBinding educationResourcesFragmentBinding;
    public static EducationResourcesFragment newInstance() {
        return new EducationResourcesFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        educationResourcesFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.education_resources_fragment, container,false);
        View educationview = educationResourcesFragmentBinding.getRoot();
        return educationview;
    }
}
