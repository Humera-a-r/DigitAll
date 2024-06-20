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
import com.example.digitall.databinding.TransactionFragmentBinding;

public class TransactionFragment extends DialogFragment {
    TransactionFragmentBinding transactionFragmentBinding;
    public static TransactionFragment newInstance() {
        return new TransactionFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        transactionFragmentBinding= DataBindingUtil.inflate(inflater, R.layout.transaction_fragment, container,false);
        View transview = transactionFragmentBinding.getRoot();
        return transview;
    }
}
