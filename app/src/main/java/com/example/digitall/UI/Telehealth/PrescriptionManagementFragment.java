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
import com.example.digitall.databinding.PrescriptionManagementFragmentBinding;

public class PrescriptionManagementFragment extends DialogFragment {
    PrescriptionManagementFragmentBinding prescriptionManagementFragmentBinding;
    public static PrescriptionManagementFragment newInstance() {
        return new PrescriptionManagementFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        prescriptionManagementFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.prescription_management_fragment, container,false);
        View prescriptview = prescriptionManagementFragmentBinding.getRoot();
        return prescriptview;
    }
}
