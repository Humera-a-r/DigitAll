package com.example.digitall.UI.SupplyChain;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.DialogFragment;

import com.example.digitall.R;
import com.example.digitall.databinding.SupplychainFragmentBinding;

public class SupplyChainFragment extends DialogFragment {
    SupplychainFragmentBinding supplychainFragmentBinding;
    private Button registerbtn;  private Button TransactionandDataManagement;  private Button TraceProductbtn;  private Button Communicatewithconsumer;  private Button FinancialManagement;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        supplychainFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.supplychain_fragment, container, false);
        View supplyView = supplychainFragmentBinding.getRoot();
        return supplyView;
    }
}
