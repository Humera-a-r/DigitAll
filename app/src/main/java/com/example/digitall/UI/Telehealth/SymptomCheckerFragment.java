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
import com.example.digitall.databinding.SymptomCheckerFragmentBinding;

public class SymptomCheckerFragment extends DialogFragment {
    SymptomCheckerFragmentBinding symptomCheckerFragmentBinding;
    public static SymptomCheckerFragment newInstance() {
        return new SymptomCheckerFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        symptomCheckerFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.symptom_checker_fragment, container,false);
        View symptomview = symptomCheckerFragmentBinding.getRoot();
        return symptomview;
    }
}
