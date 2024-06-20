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
import com.example.digitall.databinding.FinancialManagemntFragmentBinding;

public class FinancialManagemntFragment extends DialogFragment {
    FinancialManagemntFragmentBinding financialManagemntFragmentBinding;
    public static FinancialManagemntFragment newInstance() {
        return new FinancialManagemntFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        financialManagemntFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.financial_managemnt_fragment, container,false);
        View finaceview = financialManagemntFragmentBinding.getRoot();
        return finaceview;
    }
}
