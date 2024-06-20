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
import com.example.digitall.UI.SupplyChain.CommunicateWithConsumerFragment;
import com.example.digitall.UI.SupplyChain.FinancialManagemntFragment;
import com.example.digitall.UI.SupplyChain.RegisterFragment;
import com.example.digitall.UI.SupplyChain.TraceProductFragment;
import com.example.digitall.UI.SupplyChain.TransactionFragment;
import com.example.digitall.databinding.SupplychainFragmentBinding;

public class SupplyChainFragment extends DialogFragment implements View.OnClickListener {
    SupplychainFragmentBinding supplychainFragmentBinding;
    private Button registerbtn;  private Button TransactionandDataManagement;  private Button TraceProductbtn;  private Button Communicatewithconsumer;  private Button FinancialManagement;


    public static SupplyChainFragment newInstance() {
        return new SupplyChainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        supplychainFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.supplychain_fragment, container, false);
        View supplyView = supplychainFragmentBinding.getRoot();
        configureViewFinding();
        return supplyView;

    }

    private void configureViewFinding() {
        AppCompatImageView imageBack = supplychainFragmentBinding.imageBack;
        imageBack.setOnClickListener(v -> dismiss());
        TransactionandDataManagement  = supplychainFragmentBinding.TransactionandDataManagement;
        TransactionandDataManagement.setOnClickListener(this);
        registerbtn  = supplychainFragmentBinding.RegisterBtn;
        registerbtn.setOnClickListener(this);
        TraceProductbtn  = supplychainFragmentBinding.TraceProductbtn;
        TraceProductbtn.setOnClickListener(this);
        Communicatewithconsumer  = supplychainFragmentBinding.Communicatewithconsumer;
        Communicatewithconsumer.setOnClickListener(this);

        FinancialManagement  = supplychainFragmentBinding.FinancialManagement;
        FinancialManagement.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == registerbtn.getId()){
            DialogFragment register = RegisterFragment.newInstance();
            register.setArguments(new Bundle());
            register.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            register.show(getChildFragmentManager(), "Register");
        } else if (view.getId() == TransactionandDataManagement.getId()) {
            DialogFragment trans = TransactionFragment.newInstance();
            trans.setArguments(new Bundle());
            trans.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            trans.show(getChildFragmentManager(), "Transaction Management");

        }else if (view.getId() == TraceProductbtn.getId()) {
            DialogFragment traceproduct = TraceProductFragment.newInstance();
            traceproduct.setArguments(new Bundle());
            traceproduct.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            traceproduct.show(getChildFragmentManager(), "Administration Module");

        }else if (view.getId() == Communicatewithconsumer.getId()) {
            DialogFragment communicate = CommunicateWithConsumerFragment.newInstance();
            communicate.setArguments(new Bundle());
            communicate.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            communicate.show(getChildFragmentManager(), "Communication");

        }else if (view.getId() == FinancialManagement.getId()) {
            DialogFragment finance = FinancialManagemntFragment.newInstance();
            finance.setArguments(new Bundle());
            finance.setStyle(DialogFragment.STYLE_NORMAL, R.style.Theme_DigitAll);
            finance.show(getChildFragmentManager(), "Financial Management");

        }
    }
}